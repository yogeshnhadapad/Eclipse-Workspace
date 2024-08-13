package com.Mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mongo.demo.Repository.BookRepo;
import com.Mongo.demo.model.Book;
import com.Mongo.demo.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	@Autowired
	BookRepo repo;
	
	@PostMapping("/addBook")
	public void addBook(@RequestBody Book book) {
		
		bs.addBook(book);
		
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return repo.findAll();
	}
	

}
