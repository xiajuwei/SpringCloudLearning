package com.study.springrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class RabbitReceiver {

    /**
     * 接受queue为first的消息
     *
     * @param message
     */
    @RabbitListener(queuesToDeclare = @Queue(name = "first"))
    @RabbitHandler
    public void process1(String message) {

        System.out.println("RabbitReceiver1: " + message);

    }

    /**
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,
            exchange = @Exchange(value = "myExchange"),
            key = "second-1"))
    @RabbitHandler
    public void process2_1(String message) {

        System.out.println("RabbitReceiver2-1: " + message);

    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,
            exchange = @Exchange(value = "myExchange", ignoreDeclarationExceptions = "true"),
            key = "second-2"))
    @RabbitHandler
    public void process2_2(String message) {

        System.out.println("RabbitReceiver2-2: " + message);

    }


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "third-1"),
            exchange = @Exchange(value = "myFanout", ignoreDeclarationExceptions = "true")
    ))
    @RabbitHandler
    public void process3_1(String message) {

        System.out.println("RabbitReceiver3_1: " + message);

    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "third-2"),
            exchange = @Exchange(value = "myFanout", ignoreDeclarationExceptions = "true")
    ))
    @RabbitHandler
    public void process3_2(String message) {

        System.out.println("RabbitReceiver3_2: " + message);

    }


}
