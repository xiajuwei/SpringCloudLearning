//package com.study.springrabbitmq.config;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.FanoutExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SenderConf {
//    @Bean(name="aMessage")
//    public Queue aMessage(){
//        return new Queue("fanout.A");
//    }
//
//    @Bean(name="bMessage")
//    public Queue bMessage(){
//        return new Queue("fanout.B");
//    }
//
//    @Bean(name="cMessage")
//    public Queue cMessage(){
//        return new Queue("fanout.C");
//    }
//
//    @Bean
//    FanoutExchange fanoutExchange(){
//        return new FanoutExchange("fanoutExchange");
//    }
//
//    @Bean
//    Binding bindingExchangeA(@Qualifier("aMessage") Queue Message, FanoutExchange fanoutExchange){
//        return BindingBuilder.bind(Message).to(fanoutExchange);
//    }
//
//    @Bean
//    Binding bindingExchangeB(@Qualifier("bMessage") Queue Message, FanoutExchange fanoutExchange){
//        return BindingBuilder.bind(Message).to(fanoutExchange);
//    }
//
//    @Bean
//    Binding bindingExchangeC(@Qualifier("cMessage") Queue Message, FanoutExchange fanoutExchange){
//        return BindingBuilder.bind(Message).to(fanoutExchange);
//    }
//}