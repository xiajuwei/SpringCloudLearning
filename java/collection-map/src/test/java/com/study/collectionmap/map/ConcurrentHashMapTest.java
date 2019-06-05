package com.study.collectionmap.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ConcurrentHashMap;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ConcurrentHashMapTest {
    /**
     * 线程安全
     */

    @Test
    public void test1() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("a", "b");
        System.out.println(concurrentHashMap);


    }


}
