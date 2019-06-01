package com.study.jdk8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jdk8ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void LambdaTest() {
        List<String> list = Arrays.asList("Google", "Runoob", "Runoob", "Taobao", "Baidu", "Sina", "souhu");

//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

//        this.compare(list);
//        System.out.println(list);


    }

    private void compare(List<String> list) {

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

    }

    /**
     * 方法引用
     */
//    @Test
//    public void yinYongTest() {
//        Car car = new Car();
//
//        car.repair();
//
//    }
//
//    @Test
//    public void streamTest() {
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println(filtered.toString());
//
//    }


}

class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
//    public static Car create(final Supplier<Car> supplier) {
//        return supplier.get();
//    }
//
//    public static void collide(final Car car) {
//        System.out.println("Collided " + car.toString());
//    }
//
//    public void follow(final Car another) {
//        System.out.println("Following the " + another.toString());
//    }
//
//    public void repair() {
//        System.out.println("Repaired " + this.toString());
//    }
}
