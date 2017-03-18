package com.janita.kafka.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * Created by Janita on 2017/3/16
 */
@SpringBootApplication
public class KafkaTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaTwoApplication.class,args);
    }
}
