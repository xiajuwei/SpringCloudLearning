package com.study.collectionmap.collection.set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedHashSet;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LinkedHashSetTest {
    /**
     * 元素不重复，存取有序，无下标
     * 基于链表和哈希表实现
     */
    @Test
    public void test1() {
        // 利用HashSet来存取
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add(null);
        set.add("我的天");
        set.add("我是重复的");
        set.add("我是重复的");
        set.add(null);
        set.add("welcome");

//        set.remove("我是重复的");

        set.forEach(s -> System.out.println(s));


    }





}
