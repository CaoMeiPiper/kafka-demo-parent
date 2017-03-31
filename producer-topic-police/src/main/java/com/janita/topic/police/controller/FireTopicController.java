package com.janita.topic.police.controller;

import com.janita.topic.police.service.FireTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-31 14:55
 */
@RestController
@RequestMapping("/fire")
public class FireTopicController {

    @Autowired
    private FireTopicService fireTopicService;

    @GetMapping
    public String callFire(String msg){
        return fireTopicService.doCallFire(msg);
    }
}
