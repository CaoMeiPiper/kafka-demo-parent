package com.janita.kafka.two;

import com.janita.kafka.two.config.KafkaProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by Janita on 2017/3/16
 */
@SpringBootApplication
@EnableConfigurationProperties({KafkaProps.class})
public class KafkaTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaTwoApplication.class,args);
    }
}
