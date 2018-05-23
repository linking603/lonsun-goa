package cn.lonsun.filter;

import cn.lonsun.service.impl.JedisClientUtil;
import cn.lonsun.conf.Conf;
import cn.lonsun.util.SsoLoginUtil;
import cn.lonsun.util.object.JsonUtils;
import cn.lonsun.util.object.ResultUtil;
import cn.lonsun.vo.PersonInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * web sso filter
 *
 * @author xzj 2018-05-06
 */
public class SsoFilter extends HttpServlet implements Filter {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private String ssoServer;
    private String logoutPath;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        ssoServer = filterConfig.getInitParameter(Conf.SSO_SERVER);
        if (ssoServer != null && ssoServer.trim().length() > 0) {
            logoutPath = filterConfig.getInitParameter(Conf.SSO_LOGOUT_PATH);
        }
        logger.info("XxlSsoFilter init.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String id = req.getSession().getId();
        String servletPath = ((HttpServletRequest) request).getServletPath();
        String link = req.getRequestURL().toString();

        // logout filter
        if (logoutPath != null
                && logoutPath.trim().length() > 0
                && logoutPath.equals(servletPath)) {

            SsoLoginUtil.logoutLocal(req);
            // redirect logout
            String logoutPageUrl = ssoServer.concat(Conf.SSO_LOGOUT);
            res.sendRedirect(logoutPageUrl);
            return;
        }

        // login filter
        PersonInfoVo personInfoVo = SsoLoginUtil.loginCheck(req);
        // valid login fail
        if (personInfoVo == null) {
            String header = req.getHeader("content-type");
            boolean isJson = header != null && header.contains("json");
            if (isJson) {
                // json msg
                res.setContentType("application/json;charset=utf-8");
                res.getWriter().println(JsonUtils.objectToJson(ResultUtil.build(501, "sso not login.")));
                return;
            } else {

                // redirect logout
                String loginPageUrl = ssoServer.concat(Conf.SSO_LOGIN)
                        + "?" + Conf.REDIRECT_URL + "=" + link;

                res.sendRedirect(loginPageUrl);
                return;
            }

        }
        // already login, allow
        chain.doFilter(request, response);
        return;
    }

}
