package com.study.springrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component

public class Receiver {

    @RabbitListener(queuesToDeclare = @Queue("first"))
    @RabbitHandler
    public void process1(String message) {

        System.out.println("Receiver1: " + message);

    }




    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("mySecond"),
            key = "second-1",
            value = @Queue("second")

    ))
    @RabbitHandler
    public void process2(String message) throws InterruptedException {
        System.out.println("Receiver2-1: " + message);

    }


    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("mySecond"),
            key = "second-2",
            value = @Queue("second")

    ))
    @RabbitHandler
    public void process3(String message) throws InterruptedException {
        System.out.println("Receiver2-2: " + message);

    }


}























