package cn.lonsun.service.impl;

import cn.lonsun.service.api.JedisClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class JedisClientUtil {
    //private static JedisClientService jedisClientService;
    public static JedisClientService jedisClientService = SpringContextHolder.getBean("jedisClientService");
    public static JedisClientService get(){
        return jedisClientService;
    }
}
