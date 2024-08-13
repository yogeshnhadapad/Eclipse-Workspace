package com.example.kafka.first.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	private Logger log = LoggerFactory.getLogger(MessageConsumer.class);
	
	@Autowired
	private MessageRepository messageRepo;
	
	@KafkaListener(topics="${myapp.kafka.topic}",groupId="xyz")
	public void consmer(String message) {
		log.info("MESSAGE RECIVED AT CONSMER END -> " + message);
		messageRepo.addMessage(message);
	}

}
