package com.org.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
	public ActorRepository add(String ActorName){
		if(ActorName==null) {
			throw new RuntimeException();
		} else {
			 System.out.println("Actor got added");
			 return this;
		}
	}
            public boolean delet(String ActorName) {
            	if(ActorName == null) {
            		throw new RuntimeException();
            	} else {
            		return true;
            	}
            }
}
