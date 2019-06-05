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

    @Test
    public void test2() {
        int[] arr = {9, 4, 6, 10, 11, 20, 29, 56, 19, 50, 78, 43, 21, 34, 59, 8};
        int temp;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                count++;
            }
//            for (int a : arr) {
//                System.out.println(a);
//            }
//            System.out.println("++++++++++++++++++++++++");


        }

        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println(count);

    }


    @Test
    public void test3() {
        int[] arr = {9, 4, 6, 10, 11, 20, 29, 56, 19, 50, 78, 43, 21, 34, 59, 8};
        int temp;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;

            }


        }
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println(count);

    }


}
