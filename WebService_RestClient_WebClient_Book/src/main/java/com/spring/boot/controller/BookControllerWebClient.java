package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.client.BookServiceWebClient;
import com.spring.boot.domain.Book;
@Controller("controller")
public class BookControllerWebClient {
	@Autowired
	private BookServiceWebClient service;
	
	public BookControllerWebClient() {

		System.out.println("BookControllerWebClient() is called");
	}
	public Book getBook() {
		return service.getBook();
	}
	
	public String addBook(Book b) {
		return service.addBook(b);
		
		
	}
	
	

}
