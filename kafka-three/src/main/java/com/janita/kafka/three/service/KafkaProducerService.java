package com.janita.kafka.three.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-17 17:24
 */
@Service
public class KafkaProducerService {
	
	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;
	private Logger logger = Logger.getLogger(KafkaProducerService.class);

	/**
	 * 向kafka中生成消息
	 * @param message
	 */
	public void sendDefaultInfo(String message) {
		logger.info("生产消息 ："+message);
		kafkaTemplate.sendDefault(message);
	}
}
