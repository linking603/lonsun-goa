package cn.lonsun.service.impl;

import cn.lonsun.service.api.JedisClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class JedisClientServiceImpl implements JedisClientService {
    @Autowired
    private ShardedJedisPool shardedJedisPool;
    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final int DEFAULT_EXPIRE_TIME = 7200; // 默认过期时间,单位/秒, 60*60*2=2H, 两小时

    @Override
    public String get(String key) {
        String result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.get(key);
        } catch (Exception e) {
            logger.error("jedis can not get result", e);
        } finally {
            try {
                try {
                    shardedJedis.close();
                } catch (Exception e) {
                    logger.error("jedis fail to close", e);
                }
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to get," + result);
        return result;
    }

    @Override
    public String set(String key, Integer seconds, String value) {
        String result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.setex(key, seconds != null ? seconds : DEFAULT_EXPIRE_TIME, value);
        } catch (Exception e) {
            logger.error("jedis can not set value", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to set," + result);
        return result;
    }

    @Override
    public String hget(String hkey, String key) {
        String result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.hget(hkey, key);
        } catch (Exception e) {
            logger.error("jedis can not hget result", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to hget," + result);
        return result;
    }

    @Override
    public Long hset(String hkey, String key, String value) {
        Long result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.hset(hkey, key, value);
        } catch (Exception e) {
            logger.error("jedis can not hset value", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to hset," + result);
        return result;
    }

    @Override
    public Long incr(String key) {
        Long result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.incr(key);
        } catch (Exception e) {
            logger.error("jedis can not incr", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to incr," + result);
        return result;
    }

    @Override
    public Long expire(String key, int second) {
        Long result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.expire(key, second);
        } catch (Exception e) {
            logger.error("jedis can not expire", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to expire," + result);
        return result;
    }

    @Override
    public Long ttl(String key) {
        Long result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.ttl(key);
        } catch (Exception e) {
            logger.error("jedis can not ttl", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to ttl," + result);
        return result;
    }

    @Override
    public Long del(String key) {
        Long result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.del(key);
        } catch (Exception e) {
            logger.error("jedis can not del", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to del," + result);
        return result;
    }

    @Override
    public Long hdel(String hkey, String key) {
        Long result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = shardedJedis.hdel(hkey, key);
        } catch (Exception e) {
            logger.error("jedis can not hdel", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to hdel," + result);
        return result;
    }

    @Override
    public Set<String> getkeys(String pattern) {
        Set<String> result = null;
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        try {
            result = new HashSet<String>();
            Collection<Jedis> jedises = shardedJedis.getAllShards();
            for (Jedis jedis : jedises) {
                Set<String> keys = jedis.keys(pattern);
                result.addAll(keys);
            }
        } catch (Exception e) {
            logger.error("jedis can not keys", e);
        } finally {
            try {
                shardedJedis.close();
            } catch (Exception e) {
                logger.error("jedis fail to close", e);
            }
        }
        logger.info("jedis success to getkeys");
        return result;
    }
}