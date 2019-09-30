package com.spring.boot.resource;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.pojo.Author;
import com.spring.boot.pojo.Book;

@RestController
public class BookRestAuthorController {

	
	@GetMapping(value="/getBook/{bid}",produces= {"application/json","application/xml"})
	public ResponseEntity<Book> findBook(@PathVariable("bid") Integer bid) {
		
		  Book book1=new Book(); 
		  book1.setbId(bid); book1.setName("Core Java");
		  book1.setPrice(125.00f);
		 
		
		
		Link link=ControllerLinkBuilder.linkTo(BookRestAuthorController.class).slash(bid).withSelfRel();
		
		book1.add(link);
		Link alink=ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder
						.methodOn(BookRestAuthorController.class)
						.findBookById(bid))
				.withRel("author");	
		book1.add(alink);
		
		
		
		return new ResponseEntity(book1,HttpStatus.OK);
	
	
	}
	@GetMapping("/findAuthor/{bid}")
	public ResponseEntity<Author> findBookById(@PathVariable Integer bid) {
		
		Author a=new Author(101,"Shyam");
		return new ResponseEntity(a,HttpStatus.OK);
	}
	
	
}
