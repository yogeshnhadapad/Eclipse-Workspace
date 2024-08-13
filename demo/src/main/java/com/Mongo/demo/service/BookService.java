package com.Mongo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mongo.demo.Repository.BookRepo;
import com.Mongo.demo.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bk;
	
	
	public void addBook(Book book) {
		
		bk.save(book);
		
	}

}
