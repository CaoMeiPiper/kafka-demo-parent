package com.janita.headquarter.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * Created by Janita on 2017-04-07 09:58
 */
@Component
public class HandleBigJson {
    /**
     * 处理bigJson
     * @param bigJson
     * @return
     */
    public String doHandle(String bigJson){
        JSONObject jsonObject = JSONObject.parseObject(bigJson);
        System.out.println("*******收到bigJson :　"+bigJson+" , 马上处理");
        return "处理Json完成";
    }
}
