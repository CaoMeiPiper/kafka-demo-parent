package com.janita.kafka.three.controller;

import com.janita.kafka.three.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Janita on 2017-03-17 17:21
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Resource
    private KafkaProducerService kafkaService;

    @RequestMapping("/{msg}")
    public String test(@PathVariable String msg){
        kafkaService.sendDefaultInfo(msg);
        return "index";
    }
}
