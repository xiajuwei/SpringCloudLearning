package com.study.collectionmap.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConcurrentHashMap {
    /**
     * 线程安全
     */

    @Test
    public void test1() {
        Map<String, String> conMap = new java.util.concurrent.ConcurrentHashMap<>();

        conMap.put(null,null);
        System.out.println(conMap);



    }


}
