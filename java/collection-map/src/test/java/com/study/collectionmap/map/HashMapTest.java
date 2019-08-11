package com.study.collectionmap.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.MAXIMUM_CAPACITY;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HashMapTest {

    /**
     * 基于哈希表实现
     * key和value可以为null
     * key唯一，value可重复
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

    @Test
    public void test2() {
        int n = 10 - 1;
        n |= n + 1;
        System.out.println(n);

    }

    @Test
    public void test3() {
        int a = 2 << 1;// 2*2^1
        System.out.println(a);
        int b = 8 << 3;//8*2^3
        System.out.println(b);


    }

    @Test
    public void test4() {
//        int a = tableSizeFor(5);
//        System.out.println(a);
        int n = 4;
        int b = n>>>1;
        System.out.println(b);
        n |= b;
        System.out.println(n);

    }


    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


}
