package com.study.collectionmap.collection.list;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ListTest {
    /**
     * ArrayList: 底层是使用数组实现，所以查询速度快，增删速度慢
     *
     */
    @Test
    public void test1() throws InterruptedException {
        List<String> list = Arrays.asList("集合1", "集合2", "集合3");

        // 第一种遍历方式,使用迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Thread.sleep(100);
        System.out.println("-------------------");

        // 第二种遍历方式，使用foreach
        for (String str : list) {
            System.err.println(str);
        }

        Thread.sleep(100);
        System.out.println("-------------------");

        //Lambda 表达式
        list.forEach(s -> System.out.println(s));

        Thread.sleep(100);
        System.out.println("-------------------");

        //方法引用
        list.forEach(System.out::println);


    }


}
