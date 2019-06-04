package com.study.springrabbitmq;

import com.study.springrabbitmq.send.RabbitSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitTest {
    @Resource
    private RabbitSender rabbitSender;


    @Test
    public void test1() {
        for (int i = 0; i < 1; i++) {
            rabbitSender.send1();
        }


    }

    @Test
    public void test2_1() {
        for (int i = 0; i < 1000000; i++) {
            rabbitSender.send2_1();
        }

    }

    @Test
    public void test2_2() {
        for (int i = 0; i < 100000; i++) {
            rabbitSender.send2_2();
        }

    }

    @Test
    public void test3() {
        for (int i = 0; i < 1; i++) {
            rabbitSender.send3();
        }

    }


}
