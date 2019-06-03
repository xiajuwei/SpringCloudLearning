package com.study.springrabbitmq.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Component
public class Sender {
    @Resource
    private AmqpTemplate rabbitmqTemplate;


    public void send1() {
        String content = "first send " + LocalDateTime.now();

        System.out.println(content);

        rabbitmqTemplate.convertAndSend("first", content);

    }

    public void send2() {
        String content = "second send " + LocalDateTime.now();

        System.out.println(content);

        rabbitmqTemplate.convertAndSend("mySecond", "second", content);

    }



    public void send3() {
        String content = "third send " + LocalDateTime.now();

        System.out.println(content);

        rabbitmqTemplate.convertAndSend("mySecond", "second-2", content);

    }


}
