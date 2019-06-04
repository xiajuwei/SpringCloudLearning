//package com.study.springrabbitmq.receiver;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class MyReceiver {
//    @RabbitListener(queues = "fanout.A")
//    public void process1(String msg){
//        log.info("fanout.A", msg);
//    }
//
//    @RabbitListener(queues = "fanout.B")
//    public void process2(String msgs){
//        log.info("fanout.B", msgs);
//    }
//
//    @RabbitListener(queues = "fanout.C")
//    public void process3(String msgs){
//        log.info("fanout.C", msgs);
//    }
//}