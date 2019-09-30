package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.spring.boot.controller.BookControllerWebClient;
import com.spring.boot.domain.Book;

@SpringBootApplication
public class WebServiceRestClientWebClientBookApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx=null;
		BookControllerWebClient book=null;
		ctx=SpringApplication.run(WebServiceRestClientWebClientBookApplication.class, args);
		book=ctx.getBean("controller",BookControllerWebClient.class);
		System.out.println(book.getBook());
		System.out.println("----------------------------------------------->");
		System.out.println(book.addBook(new Book(101,"spring",1000.00f)));
		
	}

}
