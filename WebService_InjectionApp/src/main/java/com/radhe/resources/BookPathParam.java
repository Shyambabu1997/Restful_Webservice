package com.radhe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.radhe.domain.Book;

@Path("/book")
public class BookPathParam {
	
	public BookPathParam() {

		System.out.println("BookPathParam.BookPathParam()");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}/{name}")
	public Book getBook(@PathParam("id") String bookId,@PathParam("name") String bookName) {
		System.out.println("BookPathParam.getBook(-,-)");
		
		System.out.println("Book id"+bookId);
		Book book=new Book();
		// setting dummy data to reponse
		
		
		book.setId(Integer.parseInt(bookId));
		book.setName(bookName);
		book.setPrice(250);
		return book;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public float getPrice(@PathParam("id") String bookId) {
		System.out.println("BookPathParam.getBook(-)");
		
		System.out.println("Book id"+bookId);
		// setting dummy data to reponse
		
		float price=250;
		return price;
	}
	

}
