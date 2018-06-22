package com.lxl.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

/**
 * @auther lixinlong
 * @create 2018/6/9
 */
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback{
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println(" 回调id:" + correlationData);
        if (ack) {
            System.out.println("消息成功消费");
        } else {
            System.out.println("消息消费失败:" + cause+"\n重新发送");

        }
    }
}