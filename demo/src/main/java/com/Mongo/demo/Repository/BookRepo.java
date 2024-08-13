package com.Mongo.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mongo.demo.model.Book;

public interface BookRepo extends MongoRepository<Book, Integer>{

	
	
}
