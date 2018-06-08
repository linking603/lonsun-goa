package cn.lonsun.service.api;

import java.util.Set;

public interface JedisClientService {

    String get(String key);

    String set(String key, Integer seconds, String value);

    String hget(String hkey, String key);

    Long hset(String hkey, String key, String value);

    Long incr(String key, Long value);

    Long expire(String key, int second);

    Long ttl(String key);

    Long del(String key);

    Long hdel(String hkey, String key);

    Set<String> getkeys(String pattern);

    Long hincrBy(String hkey, String key, Long value);
}
