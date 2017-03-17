package com.janita.kafka.one;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017/3/16 0016.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaOneApplicationTests {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;



    @Test
    public void kakf(){
        kafkaTemplate.send("test-topic", "hello**********");
    }

}
