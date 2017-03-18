package com.janita.kafka.three.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

/**
 * Created by Janita on 2017-03-17 17:23
 */
public class KafkaConsumerService implements MessageListener<Integer, String>{

	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(KafkaProducerService.class);

	/**
	 * kafka消息消费者
	 * @param record
	 */
	public void onMessage(ConsumerRecord<Integer, String> record) {
		logger.warn("消费消息 ："+record.value());
	}
}