package com.study.collectionmap.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HashMapTest {

    /**
     *
     */
    @Test
    public void test1() throws InterruptedException {
        // 利用HashMap存储
        HashMap<String, Integer> map = new HashMap<>();

        map.put("张三", 12);
        map.put("李四", 13);
        map.put("小花", 22);
        map.put("小黑", 32);
        map.put("王五", 15);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        Thread.sleep(10);
        System.out.println("------------------------");







    }


}
