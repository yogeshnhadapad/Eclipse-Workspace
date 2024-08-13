package com.Mongo.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book {
        private Integer id;
        private String authorName;
        private String bookName;
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(int id, String authorName, String bookName) {
			super();
			this.id = id;
			this.authorName = authorName;
			this.bookName = bookName;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getBooName() {
			return bookName;
		}
		public void setBooName(String booName) {
			this.bookName = booName;
		}
        
}
