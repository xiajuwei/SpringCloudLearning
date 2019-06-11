package com.study.java.designpatterns.decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DecoratorTest {
    /**
     * 装饰者模式
     */
    @Test
    public void test1() {
        Food food = new Food("香肠");
        Cream cream = new Cream(food);
        Vegetable vegetable = new Vegetable(cream);
        Bread bread = new Bread(vegetable);
        System.out.println(bread.make());


    }

    @Test
    public void test2() {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());

    }


}
