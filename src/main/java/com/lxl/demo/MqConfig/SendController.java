package com.lxl.demo.MqConfig;

import com.lxl.demo.config.ConnectionFactoryConfigure;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * @auther lixinlong
 * @create 2018/6/9
 */
@RestController
public class SendController{

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/send")
    public String send3() throws UnsupportedEncodingException {
        String uuid = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(uuid);
        rabbitTemplate.convertAndSend(ConnectionFactoryConfigure.EXCHANGE, ConnectionFactoryConfigure.ROUTINGKEY2, "RabbitMq", correlationId);
        return uuid;
    }

}