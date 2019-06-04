//package com.study.springrabbitmq.send;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.time.LocalDateTime;
//
//@Component
//public class Sender {
//    @Resource
//    private AmqpTemplate amqpTemplate;
//
//
//    public void send1() {
//
//        amqpTemplate.convertAndSend("queue", "hello, rabbit.");
//    }
//
//    //topic.message, topic.messages都可以收到消息
//    public void send2() {
//        amqpTemplate.convertAndSend("exchange", "topic.message", "hello, rabbit.");
//    }
//
//
//    //只有topic.messages可以收到消息
//    public void send3() {
//
//        amqpTemplate.convertAndSend("exchange", "topic.messages", "hello, rabbit.");
//    }
//
//    //参数2可以随便写
//    public void send4() {
//        amqpTemplate.convertAndSend("fanoutExchange", "", "fanoutExchange MESSAGE!!");
//    }
//
//
//}
