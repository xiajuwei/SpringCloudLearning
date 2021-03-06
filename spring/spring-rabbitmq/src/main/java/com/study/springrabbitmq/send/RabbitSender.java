package com.study.springrabbitmq.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Component
public class RabbitSender implements RabbitTemplate.ConfirmCallback {

    @Resource
    private AmqpTemplate rabbitTemplate;

    public void send1() {

        String content = "send1 ==>" + LocalDateTime.now();
        System.out.println(content);
        rabbitTemplate.convertAndSend("first", content);

    }

    public void send2_1() {

        String content = "send2_1 ==>" + LocalDateTime.now();
        System.out.println(content);
        rabbitTemplate.convertAndSend("myExchange", "second-1", content);

    }

    public void send2_2() {

        String content = "send2_2 ==>" + LocalDateTime.now();
        System.out.println(content);
        rabbitTemplate.convertAndSend("myExchange", "second-2", content);

    }

    /**
     * 广播模式下设置任意routingKey参数  可以为空
     */
    public void send3() {

        String content = "send3 ==>" + LocalDateTime.now();
        System.out.println(content);
        rabbitTemplate.convertAndSend("myFanout", "xxxxx", content);

    }

    public void send4_1() {

        String content = "send4_1 ==>" + LocalDateTime.now() + " red";
        System.out.println(content);
        rabbitTemplate.convertAndSend("myKey", "red", content);

    }

    public void send4_2() {

        String content = "send4_2 ==>" + LocalDateTime.now() + " yellow";
        System.out.println(content);
        rabbitTemplate.convertAndSend("myKey", "yellow", content);

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("消息唯一标识：" + correlationData);
        System.out.println("确认结果：" + ack);
        System.out.println("失败原因：" + cause);
    }
}
