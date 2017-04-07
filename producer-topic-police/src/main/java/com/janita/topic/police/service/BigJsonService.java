package com.janita.topic.police.service;

import com.janita.topic.police.constants.Consts;
import com.janita.topic.police.utils.KafkaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-04-07 09:53
 */
@Service
public class BigJsonService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    /**
     * 发送超大的json到kafka
     * @param bigJson
     * @return
     */
    public String sendJson(String bigJson) {
        KafkaUtils.sendMsg(kafkaTemplate, Consts.BIG_JSON,bigJson);
        return "处理bigJson成功";
    }
}
