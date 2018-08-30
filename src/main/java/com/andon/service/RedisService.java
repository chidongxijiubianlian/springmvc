package com.andon.service;

import org.apache.commons.dbcp.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author by yangzhi
 * @date 2018.08.27 13:12
 * @Moode o_O
 **/
@Service
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 判断key是否存在
     * @param key 键
     * @return true 存在 false不存在
     */
    public boolean hasKey(String key){
            return redisTemplate.hasKey(key);
    }
    public boolean set(String key,Object value) {
            redisTemplate.opsForValue().set(key, value);
            return true;
    }
    public Object get(String key) {
        redisTemplate.opsForValue().get(key);
        return true;
    }
}
