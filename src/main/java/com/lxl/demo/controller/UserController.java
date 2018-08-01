package com.lxl.demo.controller;

import com.lxl.demo.config.ConnectionFactoryConfigure;
import com.lxl.demo.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * <dl>
 * <dt>UserController</dt>
 * <dd>@auther lixinlong</dd>
 * <dd>@create 2018/6/22</dd>
 * <dd></dd>
 * </dl>
 */
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public boolean login(@RequestParam("username")String username,@RequestParam("password")String password){
        System.out.println(username);
        System.out.println(password);
        String uuid = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(uuid);
        User lxl = new User();
        lxl.setUsername(username);
        lxl.setPassword(password);
        rabbitTemplate.convertAndSend(ConnectionFactoryConfigure.EXCHANGE, ConnectionFactoryConfigure.ROUTINGKEY1, lxl.toString(), correlationId);
        return true;
    }
}
