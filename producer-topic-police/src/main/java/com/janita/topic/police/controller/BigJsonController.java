package com.janita.topic.police.controller;

import com.janita.topic.police.service.BigJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-04-07 09:51
 */
@RestController
@RequestMapping("/big")
public class BigJsonController {

    @Autowired
    private BigJsonService bigJsonService;

    @PostMapping
    public String postMsg(@RequestBody String bigJson){
        return bigJsonService.sendJson(bigJson);
    }

}
