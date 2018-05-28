package cn.lonsun.util;

import cn.lonsun.conf.Conf;
import cn.lonsun.service.impl.JedisClientUtil;
import cn.lonsun.util.object.EncryptUtil;
import cn.lonsun.util.object.JsonUtils;
import cn.lonsun.vo.PersonInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public class SsoLoginUtil {
    private static Logger logger = LoggerFactory.getLogger(SsoLoginUtil.class);

    public static String getToken(HttpServletRequest request) {
        //HttpSession httpSession = request.getSession();
        String token = request.getParameter(Conf.OA_SSO_TOKEN);
        /*Object sessionToken = httpSession.getAttribute(Conf.OA_SSO_TOKEN);
        token = StringUtils.isNotBlank(token) ? token :
                (sessionToken != null && StringUtils.isNotBlank(sessionToken.toString()) ? sessionToken.toString() : httpSession.getId());*/
        String uri = request.getRequestURI();
        token = StringUtils.isNotBlank(token) ? token : ((StringUtils.isNotBlank(uri) ? "" : EncryptUtil.localSystemEncrypt(uri)) + UUID.randomUUID().toString());
        return token;
    }

    public static PersonInfoVo loginCheck(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        PersonInfoVo result = null;
        String token = getToken(request);
        if (StringUtils.isNotBlank(token)) {
            String buf = JedisClientUtil.jedisClientService.get(Conf.OA_SSO_TOKEN + token);
            if (StringUtils.isNotBlank(buf)) {
                result = JsonUtils.jsonToPojo(buf, PersonInfoVo.class);
                if (httpSession.getAttribute(Conf.OA_SSO_TOKEN) == null || !token.equals(httpSession.getAttribute(Conf.OA_SSO_TOKEN).toString()))
                    httpSession.setAttribute(Conf.OA_SSO_TOKEN, token);
                if (httpSession.getAttribute(Conf.OA_SSO_PERSON) == null)
                    httpSession.setAttribute(Conf.OA_SSO_PERSON, result);
            } else {
                httpSession.invalidate();
            }
        }
        return result;
    }

    public static void login(HttpServletRequest request, PersonInfoVo personInfoVo) {
        HttpSession httpSession = request.getSession();
        String token = getToken(request);
        JedisClientUtil.jedisClientService.set(Conf.OA_SSO_TOKEN + token, null, JsonUtils.objectToJson(personInfoVo));
        httpSession.setAttribute(Conf.OA_SSO_TOKEN, token);
        httpSession.setAttribute(Conf.OA_SSO_PERSON, personInfoVo);
    }

    public static void logoutLocal(HttpServletRequest request) {
        String token = getToken(request);
        JedisClientUtil.jedisClientService.del(Conf.OA_SSO_TOKEN + token);
        request.getSession().invalidate();
    }

    public static void logoutAll(HttpServletRequest request) {
        String token = getToken(request);
        String buf = JedisClientUtil.jedisClientService.get(Conf.OA_SSO_TOKEN + token);
        if (StringUtils.isNotBlank(buf)) {
            PersonInfoVo personInfoVo = JsonUtils.jsonToPojo(buf, PersonInfoVo.class);
            if (personInfoVo != null && personInfoVo.getUserId() != null) {
                BigDecimal userId = personInfoVo.getUserId();
                Set<String> keys = JedisClientUtil.jedisClientService.getkeys(Conf.OA_SSO_TOKEN + "*");
                for (String key : keys) {
                    if (StringUtils.isNotBlank(key)) {
                        buf = JedisClientUtil.jedisClientService.get(key);
                        if (StringUtils.isNotBlank(buf)) {
                            personInfoVo = JsonUtils.jsonToPojo(buf, PersonInfoVo.class);
                            if (personInfoVo != null && personInfoVo.getUserId() != null && userId.longValue() == personInfoVo.getUserId().longValue()) {
                                JedisClientUtil.jedisClientService.del(key);
                            }
                        }
                    }
                }
            }
        }
        request.getSession().invalidate();
    }
}
