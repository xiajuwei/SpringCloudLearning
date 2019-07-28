package com.study.springrabbitmq;

import com.study.springrabbitmq.send.RabbitSender;

import javax.annotation.Resource;

public class RabbitConfirmTest {
    @Resource
    private static RabbitSender rabbitSender;

    public static void main(String[] args) {
        rabbitSender.send2_1();
    }


}
