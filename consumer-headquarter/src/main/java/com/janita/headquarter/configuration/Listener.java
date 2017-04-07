package com.janita.headquarter.configuration;

import com.janita.headquarter.constants.Consts;
import com.janita.headquarter.service.HandleBigJson;
import com.janita.headquarter.service.HandleFire;
import com.janita.headquarter.service.HandlePolice;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

/**
 * Created by Janita on 2017-03-17 14:40
 */
public class Listener {

    @Autowired
    private HandlePolice handlePolice;
    @Autowired
    private HandleFire handleFire;
    @Autowired
    private HandleBigJson handleBigJson;

    @KafkaListener(topics = {Consts.POLICE})
    public void listenPolice(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()){
            String message = (String) kafkaMessage.get();

            System.out.println("\n总部收到报警 : "+ message);
            handlePolice.doHandle(message);
        }
    }

    @KafkaListener(topics = {Consts.FIRE})
    public void listenFire(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()){
            String msg = (String) kafkaMessage.get();

            System.out.println("\n总部收到火警 : "+ msg);
            handleFire.doHandleFire(msg);
        }
    }

    @KafkaListener(topics = {Consts.BIG_JSON})
    public void listenBigJson(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()){
            String msg = (String) kafkaMessage.get();

            System.out.println("\n总部收到超级大的bigJson : "+ msg);
            handleBigJson.doHandle(msg);
        }
    }
}