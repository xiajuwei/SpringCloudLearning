package com.study.collectionmap.collection.list;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Enumeration;
import java.util.Vector;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VectorTest {
    /**
     * 基于数组实现，查询快，增删慢，线程安全
     */

    @Test
    public void test1() {
        Vector<String> vector = new Vector<>();
        vector.add("集合1");
        vector.add("集合2");
        vector.add("集合3");

        Enumeration<String> en = vector.elements();

        while (en.hasMoreElements()) {

            System.out.println(en.nextElement());

        }
    }


}
