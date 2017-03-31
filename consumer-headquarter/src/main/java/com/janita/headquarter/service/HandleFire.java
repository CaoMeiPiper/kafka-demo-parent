package com.janita.headquarter.service;

import org.springframework.stereotype.Component;

/**
 * Created by Janita on 2017-03-31 15:11
 */
@Component
public class HandleFire {

    public String doHandleFire(String msg){
        System.out.println("*******收到火警　：　"+msg+" , 马上到达现场");
        return "消防员出警中";
    }
}
