
 package com.spring.boot.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.spring.boot.domain.Book;

import reactor.core.publisher.Mono;

@Service
public class BookServiceWebClient {
	
	public Book getBook() {
		String resUrl="http://localhost:8089//WebService_SpringBoot_Resource//getBook";
		
		WebClient client=WebClient.create(resUrl);
		Mono<Book> body = client.get()
										.retrieve()
										.bodyToMono(Book.class);
		Book book = body.block();
		
		
		return book;
	}
	public String addBook(Book book) {
		String resUrl="http://localhost:8089//WebService_SpringBoot_Resource//addBook";
		WebClient client = WebClient.create(resUrl);
		Mono<String> body = client.post()
								  .syncBody(book)
								  .retrieve()
								  .bodyToMono(String.class);
		String response = body.block();
		return response;
	}
}
