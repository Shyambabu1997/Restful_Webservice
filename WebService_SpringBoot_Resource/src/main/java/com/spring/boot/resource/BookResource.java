package com.spring.boot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.domain.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("This is BookResource Class and it has two operation ")
@RestController("book")
public class BookResource {
	
	@ApiOperation("This method is used to retrive book information according to the book id")
	@GetMapping(value="/getBook",produces= {"application/json","application/xml"})
	public Book findBook() {
		Book book1=new Book();
		book1.setId(111);
		book1.setName("Core Java");
		book1.setPrice(125.00f);
		return book1;
	}
	@ApiOperation("This method is used to add a book details to the database")
	@PostMapping(value="/addBook",consumes = {"application/json","application/xml"})
	public String addBook(@RequestBody Book b) {

		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		return "Successfully Added";
	}

}
