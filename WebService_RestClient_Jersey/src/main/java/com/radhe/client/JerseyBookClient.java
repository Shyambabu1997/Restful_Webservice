package com.radhe.client;



import javax.ws.rs.core.MediaType;

import com.radhe.domain.Book;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyBookClient {
	static String  resUrl="http://localhost:3030/WebService_Book_Postman/rest/book";
	
	public static void main(String[] args) throws Exception {

		addBook();
		getBook();

	}
	private static  void addBook() {
		
		Book b=new Book();
		b.setId(101);
		b.setName("Shyam");
		b.setPrice(1000);
		Client client=Client.create();
	WebResource resource=client.resource(resUrl);
			
	ClientResponse response=resource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class,b);
	int status=response.getStatus();
	System.out.println(status);
	if(status==200) {
		String msg=response.getEntity(String.class);
		System.out.println(msg);
	}
	}
	private static WebResource getBook() {
		
		Client client=Client.create();
		WebResource web=client.resource(resUrl);
		web.accept(MediaType.APPLICATION_JSON);
		
		ClientResponse response=web.get(ClientResponse.class);
		int status=response.getStatus();
		System.out.println(status);
		Book msg=response.getEntity(Book.class);
		if(status==200)
			System.out.println(msg);
		return web;
	}

}
