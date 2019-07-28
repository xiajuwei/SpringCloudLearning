package com.study.collectionmap.collection.list;

import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

            for (int j = i + 1; j < arr.length; j++) {
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

    @Test
    public void test4() {
        List<String> list = Arrays.asList("d", "b", "a", "c", "a", "a");
        int[] arr = {9, 4, 6, 10, 11, 20, 29, 56, 19, 50, 78, 43, 21, 34, 59, 8};
        Boolean exist = false;
        Stream<String> stream = list.stream().filter(s -> s.equals("a"));
        Collection<String> collection = stream.collect(Collectors.toList());
        collection.forEach(s-> System.out.println(s));

//        List list1 = Arrays.asList(arr);
//        list1.forEach(s-> System.out.println(s));
//        System.out.println(list1.size());

<<<<<<< HEAD
//        Optional min = list.stream().min(Comparator.comparing(Function.identity()));
////        Optional max = list.stream().max((s1, s2) -> s2.compareTo(s1));
//        Optional max = list.stream().max(Comparator.comparing(String::hashCode));
//
//        System.out.println(String.format("min: %s,max: %s", min, max));

//        Stream<String> stream = list.stream().distinct();
//
//        stream.forEach(s -> System.out.println(s));
//        Stream stream1 = list.stream().filter(s -> s.equals("a"));
//
//        stream1.forEach(s -> System.out.println(s));
//        Stream stream1 = list.stream().sorted();
//        stream1.forEach(s -> System.out.println(s));
=======
        Optional min = list.stream().min(Comparator.comparing(Function.identity()));
//        Optional max = list.stream().max((s1, s2) -> s2.compareTo(s1));
        Optional max = list.stream().max(Comparator.comparing(String::hashCode));

        System.out.println(String.format("min: %s,max: %s", min, max));

        Stream<String> stream = list.stream().distinct();

        stream.forEach(s -> System.out.println(s));
//        Stream stream = list.stream().filter(s -> !s.equals("a"));
        stream.forEach(s-> System.out.println(s));

>>>>>>> 10101a4ca592070cc98740dd9b51164f18acf464


    }

    @Test
    public void test5() {
        List<People> list = Arrays.asList(new People("张三", 20), new People("李四", 21), new People("王五", 23));
//        list.forEach(people -> System.out.println(people));

//        Optional max = list.stream().max((p1, p2) -> p1.getAge() - p2.getAge());
//        System.out.println(max);
//        Optional max = list.stream().max(Comparator.comparing(People::getAge));
//        System.out.println(max);


    }


}

@Data
class People {

    private String name;
    private Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

