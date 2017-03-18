package com.janita.kafka.two.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

/**
 * Created by Janita on 2017-03-17 14:40
 */
public class Listener {

    @KafkaListener(topics = {"test-topic"})
    public void listen(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()){
            Object message = kafkaMessage.get();
            System.out.println("\n*****消费消息 : "+ message);
        }
    }
}
