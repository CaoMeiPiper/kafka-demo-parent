package com.janita.headquarter.configuration;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Janita on 2017-03-17 14:21
 */
@Configuration
@EnableKafka
public class KafkaConsumerConfig {

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {

        ConcurrentKafkaListenerContainerFactory<String,String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.getContainerProperties().setPollTimeout(3000);
        factory.setConcurrency(3);

        return factory;
    }

    public ConsumerFactory<String,String> consumerFactory(){
        return new DefaultKafkaConsumerFactory<String, String>(consumerConfig());
    }

    public Map<String,Object> consumerConfig(){
        Map<String,Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,false);
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG,"15000");
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG,"100");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG,"test-group");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"latest");

        //消费大数据
        props.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG,15725640 );

        return props;
    }

    @Bean
    public Listener listener(){
        return new Listener();
    }
}
