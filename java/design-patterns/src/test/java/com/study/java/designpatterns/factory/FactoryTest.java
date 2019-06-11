package com.study.java.designpatterns.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FactoryTest {

    @Test
    public void test1() {

        Car car = Factory.getInstance("BMW");
        if (car != null) {
            car.run();
            car.stop();
        } else {
            System.out.println("没有这种汽车");
        }


    }
}
