package com.org.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
      public MovieRepository add(String movieName) {
    	  if(movieName == null) {
    		  throw new RuntimeException();
    	  } else {
    		  System.out.println("movie got added");
    		  return this;
    	  }
      }
	 
      public boolean delet(String movieName) {
    	  if(movieName == null) {
    		  throw new RuntimeException();
    	  }else {
    		  return true;
    	  }
      }
	
}
