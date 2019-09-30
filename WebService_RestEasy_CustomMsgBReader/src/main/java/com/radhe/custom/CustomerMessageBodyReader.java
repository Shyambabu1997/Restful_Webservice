package com.radhe.custom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.radhe.resource.Customer;
@Provider
public class CustomerMessageBodyReader implements MessageBodyReader<Customer> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		System.out.println("isReadable() is called");

		return true;
	}

	@Override
	public Customer readFrom(Class<Customer> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
			
		InputStreamReader is=new InputStreamReader(entityStream);
		
		BufferedReader br=new BufferedReader(is);
		String name=br.readLine();
		int id=(Integer.parseInt(br.readLine()));
		String email=br.readLine();
		
		Customer c=new Customer();
		c.setEmail(email);
		c.setId(id);
		c.setName(name);
		

		
		return c;
	}
	

}
