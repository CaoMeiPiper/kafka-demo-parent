package com.janita.topic.police.utils;

import org.springframework.kafka.core.KafkaTemplate;

/**
 * Created by Janita on 2017-03-31 14:28
 */
public class KafkaUtils {

    /**
     * 向topic发送msg
     * @param topic 卡夫卡的topic
     * @param msg   发送的消息
     * @param kafkaTemplate  卡夫卡模板
     */
    public static void sendMsg(KafkaTemplate<String,String> kafkaTemplate ,String topic, String msg){
        kafkaTemplate.send(topic,msg);
    }
}
