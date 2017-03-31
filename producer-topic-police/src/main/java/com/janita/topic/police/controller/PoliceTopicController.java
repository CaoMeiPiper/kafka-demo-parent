package com.janita.topic.police.controller;

import com.janita.topic.police.service.PoliceTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-31 14:22
 */
@RestController
@RequestMapping("/police")
public class PoliceTopicController {

    @Autowired
    private PoliceTopicService policeTopicService;

    /**
     * 报警
     * @param msg   报警人发送的消息
     * @return
     */
    @GetMapping
    public String callPolice(String msg){
        return policeTopicService.doCallPolice(msg);
    }
}
