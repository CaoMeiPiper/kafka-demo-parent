package com.janita.topic.police.service;

import com.janita.topic.police.constants.Consts;
import com.janita.topic.police.utils.KafkaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-31 14:24
 */
@Service
public class PoliceTopicService {

    @Autowired
    private KafkaTemplate<String,String > kafkaTemplate;


    /**
     * 报警
     * @param msg
     * @return
     */
    public String doCallPolice(String msg){
        KafkaUtils.sendMsg(kafkaTemplate, Consts.POLICE,msg);
        return "报警成功";
    }
}
