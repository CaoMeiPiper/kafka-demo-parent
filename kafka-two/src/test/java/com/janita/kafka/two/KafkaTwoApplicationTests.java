package com.janita.kafka.two;

import com.alibaba.fastjson.JSON;
import com.janita.kafka.two.entity.ClazzTotalLevel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Jania on 2017/3/16
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaTwoApplicationTests {

    @Test
    public void test(){
        String json = "[\n" +
                "  {\n" +
                "    \"clazzId\": \"string\",\n" +
                "    \"collectTime\": 0,\n" +
                "    \"courseId\": \"string\",\n" +
                "    \"gradeId\": \"string\",\n" +
                "    \"progressId\": \"string\",\n" +
                "    \"progressName\": \"string\",\n" +
                "    \"progressTime\": 0,\n" +
                "    \"stuTotalLevelList\": [\n" +
                "      {\n" +
                "        \"knoTotalLevel\": [\n" +
                "          {\n" +
                "            \"knoId\": \"string\",\n" +
                "            \"level\": 0\n" +
                "          }\n" +
                "        ],\n" +
                "        \"studentId\": \"string\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"teacherId\": \"string\",\n" +
                "    \"termId\": \"string\",\n" +
                "    \"upTime\": 0\n" +
                "  }\n" +
                "]";


        List<ClazzTotalLevel> totalLevel = JSON.parseArray(json,ClazzTotalLevel.class);
        System.out.println(totalLevel.size());
    }

    @Autowired
    KafkaTemplate<String,String > kafkaTemplate;
    @Autowired
    ConsumerFactory<String,String> consumerFactory;

    @Test
    public void testKfk(){
        for (int i=0;i<4000;i++){
            kafkaTemplate.send("test-topic","hELLO Janita"+i);
        }
    }
}