package com.janita.headquarter.service;

import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-31 15:09
 */
@Service
public class HandlePolice {

    /**
     * 处理报警
     * @param msg
     * @return
     */
    public String doHandle(String msg){
        System.out.println("*******收到报警 :　"+msg+" , 马上到达现场");
        return "人民警察出警中";
    }
}
