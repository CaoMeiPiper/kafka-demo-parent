package com.janita.kafka.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Janita on 2017-03-17 17:18
 */
@SpringBootApplication
@ImportResource("classpath:kafka*.xml")
public class KafkaThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaThreeApplication.class,args);
    }
}
