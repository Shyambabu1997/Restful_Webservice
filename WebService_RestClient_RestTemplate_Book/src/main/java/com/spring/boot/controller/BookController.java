package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.service.BookService;

@RestController("book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/getBook")
	public String getBookDetails() {
		return service.getBook();
	}
	@GetMapping("/addBook")
	public String addBookDetails() {
		return service.addBook();
	}
	


	

}
