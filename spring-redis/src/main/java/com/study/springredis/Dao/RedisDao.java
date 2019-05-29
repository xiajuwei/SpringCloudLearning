package com.study.springredis.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate template;

    public void setKey(String key, String value) {
        ValueOperations<String, String> operations = template.opsForValue();
        //1分钟过期
        operations.set(key, value, 1, TimeUnit.MINUTES);

    }

    public String getValue(String key) {
        ValueOperations<String, String> operations = this.template.opsForValue();
        return operations.get(key);


    }

}
