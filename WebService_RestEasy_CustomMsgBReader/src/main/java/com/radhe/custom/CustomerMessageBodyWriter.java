package com.radhe.custom;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.radhe.resource.Customer;

@Provider
public class CustomerMessageBodyWriter implements MessageBodyWriter<Customer> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public long getSize(Customer t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public void writeTo(Customer t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {

	Writer writer=new PrintWriter(entityStream);
	writer.write("Customer Name--->"+t.getName());
	writer.write("Customer Id--->"+t.getId());
	writer.write("Customer mail--->"+t.getEmail());

	
	writer.close();
	}

}
