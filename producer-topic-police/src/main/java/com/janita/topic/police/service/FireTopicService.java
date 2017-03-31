package com.janita.topic.police.service;

import com.janita.topic.police.constants.Consts;
import com.janita.topic.police.utils.KafkaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-31 14:56
 */
@Service
public class FireTopicService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * 报火警
     * @param msg
     * @return
     */
    public String doCallFire(String msg){
        KafkaUtils.sendMsg(kafkaTemplate, Consts.FIRE,msg);
        return "报火警成功";
    }
}
