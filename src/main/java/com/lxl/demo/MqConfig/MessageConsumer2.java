package com.lxl.demo.MqConfig;

/**
 * <dl>
 * <dt>s</dt>
 * <dd>@auther lixinlong</dd>
 * <dd>@create 2018/8/1</dd>
 * <dd></dd>
 * </dl>
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

/**
 * @auther lixinlong
 * @create 2018/6/9
 */
@SuppressWarnings("all")
public class MessageConsumer2 implements ChannelAwareMessageListener {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception {
        byte[] body = message.getBody();
        logger.info("收到消息2 : " + new String(body));
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); //确认消息成功消费

    }
}
