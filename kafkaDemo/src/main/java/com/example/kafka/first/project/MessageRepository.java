package com.example.kafka.first.project;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
	
	private List<String>list = new ArrayList<>();
	
	public void addMessage(String message) {
		list.add(message);
	}

	   public String getAllMessages() {
		   return list.toString();
	   }
}
