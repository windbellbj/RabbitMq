package com.lxl.demo.MqConfig;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @auther lixinlong
 * @create 2018/6/9
 */
public class MsgSendReturnCallback implements RabbitTemplate.ReturnCallback {
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        String msgJson  = new String(message.getBody());
        System.out.println("回馈消息："+msgJson);
    }
}