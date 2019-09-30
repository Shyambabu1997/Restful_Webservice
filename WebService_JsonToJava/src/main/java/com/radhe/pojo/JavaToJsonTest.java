package com.radhe.pojo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJsonTest {

	public static void main(String[] args) throws Exception {


		convertJavaToJson();
		//convertListToJson();
		

	}
	private static void convertListToJson() throws Exception{
		
		Customer c1=new Customer(101,"Radhe","radhe@gmail.com",new Date());
		Customer c2=new Customer(102,"Shyam","shyam@gmail.com",new Date());
		Customer c3=new Customer(103,"Babu","babu@gmail.com",new Date());
		
		List<Customer> l=new ArrayList<Customer>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		
		ObjectMapper object=new ObjectMapper();
		String s=object.defaultPrettyPrintingWriter().writeValueAsString(l);
		System.out.print(s);
	}

	private static void convertJavaToJson() throws IOException, JsonGenerationException, JsonMappingException {
		Customer customer=new Customer();
		customer.setId(101);
		customer.setEmail("shyam@gmail.com");
		customer.setDob(new Date());
		
		ObjectMapper object=new ObjectMapper();
		String s=object.defaultPrettyPrintingWriter().writeValueAsString(customer);
		System.out.println(s);
	}

}
