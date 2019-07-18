package com.study.spring.springredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

//    redisTemplate.opsForValue();//操作字符串
//    redisTemplate.opsForHash();//操作hash
//    redisTemplate.opsForList();//操作list
//    redisTemplate.opsForSet();//操作set
//    redisTemplate.opsForZSet();//操作有序set

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //String 结构
    @Test
    public void test1() {
        stringRedisTemplate.opsForValue().set("opsString", "123");
        stringRedisTemplate.opsForValue().set("opsString", "456");
        String result = stringRedisTemplate.opsForValue().get("opsString");
        System.out.println(result);

    }

    @Test
    public void test2() {
        stringRedisTemplate.opsForList().leftPush("opsList", "first");
        stringRedisTemplate.opsForList().leftPush("opsList", "second");
        List<String> list = stringRedisTemplate.opsForList().range("opsList", 0, 100);
        System.out.println(list);

//        String[] list = {"1", "2", "3"};
//        stringRedisTemplate.opsForList().leftPushAll("opsListKey", list);
//        stringRedisTemplate.opsForList().rightPush("opsListKey", "right");
//        stringRedisTemplate.opsForList().rightPush("opsListKey", "null");
//        stringRedisTemplate.opsForList().leftPush("opsListKey", "null");
//        stringRedisTemplate.opsForList().leftPush("opsListKey", "");
//        Long s = stringRedisTemplate.opsForList().size("opsListKey");
//        System.out.println(s);
//        stringRedisTemplate.opsForList().trim("opsListKey", 0, 100);
//        List<String> list = stringRedisTemplate.opsForList().range("opsListKey", 0, -1);
//        System.out.println(list);


//        String result1 = stringRedisTemplate.opsForList()
//        String result2 = stringRedisTemplate.opsForList().rightPop("opsListKey");
//
//        System.out.println(result1 + " " + result2);


    }

    @Test
    public void test3() {
        stringRedisTemplate.opsForHash().put("optHash", "field1", "hash1");
        stringRedisTemplate.opsForHash().put("optHash", "field2", "hash2");
        stringRedisTemplate.expire("optHash", 5, TimeUnit.SECONDS);

        Object value = stringRedisTemplate.opsForHash().get("optHash", "field1");
        System.out.println(value);


    }

    @Test
    public void test4() {
        stringRedisTemplate.opsForSet().add("opsSet", "hello");
        stringRedisTemplate.opsForSet().add("opsSet", "world");
        Set<String> set = stringRedisTemplate.opsForSet().members("opsSet");
        System.out.println(set);

    }

    @Test
    public void test5() {
        stringRedisTemplate.opsForZSet().add("opsZSet", "redis", 1);
        stringRedisTemplate.opsForZSet().add("opsZSet", "mongodb", 2);
        Set<String> set = stringRedisTemplate.opsForZSet().range("opsZSet", 0, 100);
        System.out.println(set);

    }


}
