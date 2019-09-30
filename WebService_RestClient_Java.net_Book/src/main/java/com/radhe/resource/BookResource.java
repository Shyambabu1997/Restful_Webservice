package com.radhe.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.radhe.domain.Book;

@Path("/book")
public class BookResource {
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Book findBook() {
		Book book1=new Book();
		book1.setId(111);
		book1.setName("Core Java");
		book1.setPrice(125.00f);
		return book1;
	}
	
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String addBoo(Book b) {

		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		return "Successfully Added";
	}

}
