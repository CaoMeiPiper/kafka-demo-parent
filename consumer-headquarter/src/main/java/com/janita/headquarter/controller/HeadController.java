package com.janita.headquarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-31 14:45
 */
@RestController
@RequestMapping("/head")
public class HeadController {

    @GetMapping
    public String head(String head){
        System.out.println("*******"+head);
        return head;
    }
}
