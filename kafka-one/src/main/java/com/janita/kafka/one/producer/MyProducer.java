package com.janita.kafka.one.producer;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jaita on 2017/3/17
 */
public class MyProducer {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("serializer.class", "kafka.serializer.StringEncoder");
//        props.put("metadata.broker.list", "172.16.212.17:9091,172.16.212.17:9092,172.16.212.102:9091,172.16.212.102:9092");
        props.put("metadata.broker.list", "localhost:9092");

        Producer<Integer, String> producer = new Producer<Integer, String>(new ProducerConfig(props));
        String topic = "lxw1234.com";

        File file = new File("E:/track-log.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                producer.send(new KeyedMessage<Integer, String>(topic,line + "---" + tempString));
                System.out.println("Success send [" + line + "] message ..");
                line++;
            }
            reader.close();
            System.out.println("Total send [" + line + "] messages ..");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {}
            }
        }
        producer.close();

    }
}