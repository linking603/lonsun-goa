package cn.lonsun.util.object;

import cn.lonsun.exception.BaseRunTimeException;
import cn.lonsun.exception.TipsMode;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncryptUtil {
    private static Logger logger = LoggerFactory.getLogger(EncryptUtil.class);

    public static String localSystemEncrypt(String data) {
        if (StringUtils.isBlank(data)) {
            logger.error("加密内容为空,请检查后尝试");
            throw new BaseRunTimeException(TipsMode.Message.toString(), "加密内容为空,请检查后尝试");
        }
        return DigestUtils.md5Hex(data);
    }
}
