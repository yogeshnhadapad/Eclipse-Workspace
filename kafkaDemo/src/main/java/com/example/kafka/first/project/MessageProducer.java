package com.example.kafka.first.project;

import java.lang.System.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class MessageProducer {
	
	
	private Logger log = LoggerFactory.getLogger(MessageProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String>kafkaTemplate;
	
	@Value("${myapp.kafka.topic}")
	private String topic;
	
	public void sendMessage(String message) {
		
		log.info("MESSAGE SENT FROM PRODUCER END ->"+ message);
		kafkaTemplate.send(topic,message);
	}
	

}
