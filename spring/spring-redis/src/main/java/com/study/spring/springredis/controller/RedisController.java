package com.study.spring.springredis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

@RestController
@Slf4j
public class RedisController {

    @Autowired
    RedisLockRegistry redisLockRegistry;

    @RequestMapping("/testLock1")
    public void redisTest1() {
        Lock lock = redisLockRegistry.obtain("lock");
        try {
            boolean b1 = lock.tryLock(10, TimeUnit.SECONDS);
            log.info("b1 is :{}", b1);

            TimeUnit.SECONDS.sleep(10);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    @RequestMapping("/testLock2")
    public void redisTest2() {
        Lock lock = redisLockRegistry.obtain("lock");
        try {
            boolean b2 = lock.tryLock(5, TimeUnit.SECONDS);
            log.info("b2 is :{}", b2);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

}
