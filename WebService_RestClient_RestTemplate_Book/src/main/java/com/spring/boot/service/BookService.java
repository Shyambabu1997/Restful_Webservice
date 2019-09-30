package com.spring.boot.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.boot.domain.Book;

@Service
public class BookService {

	public BookService() {
		
		System.out.println("BookService.BookService()");
			}

		public String getBook() {
			String resUrl="http://localhost:8020//WebService_SpringBoot_Resource//getBook";

		System.out.println("getBook() method is called");
		String body=null;
		RestTemplate template=new RestTemplate(); 
		
		HttpHeaders headers = new HttpHeaders();	
		headers.add("Accept", "application/json");
		
		ResponseEntity<String> response=template.getForEntity(resUrl,String.class);
		return response.getBody();
		}
	
	public String addBook() {
		String resUrl="http://localhost:8020//WebService_SpringBoot_Resource//addBook";

		System.out.println("addBook() method is called");
		Book b = new Book();
		b.setId(201);
		b.setName("Hibernate");
		b.setPrice(350.00f);
		RestTemplate template=new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Content-Type", "application/json");
		HttpEntity<Book> request = new HttpEntity<Book>(b, headers);

		ResponseEntity<String> response = template.postForEntity(resUrl,request,String.class);
		//ResponseEntity<String> response = template.exchange(resUrl, HttpMethod.POST, request, String.class);
		return response.getBody();
	}
}
