package com.radhe.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.radhe.pojo.Book;

@Path("book")
public class BookResource {


	@GET
	public Book findBook() {
		Book book1=new Book();
		book1.setId(111);
		book1.setName("Core Java");
		book1.setPrice(125.00f);
		return book1;
	}
	
}
