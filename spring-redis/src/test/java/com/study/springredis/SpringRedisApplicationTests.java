package com.study.springredis;

import com.study.springredis.Dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRedisApplicationTests {
    @Autowired
    RedisDao redisDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void redisTest() {
        redisDao.setKey("name", "jack");
        redisDao.setKey("age", "22");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
        System.out.println("我叫" + redisDao.getValue("name") + ",今年"
                + redisDao.getValue("age") + "岁");

    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20);

        for (Integer integer : list){

            System.out.println(integer);

        }


    }


}
