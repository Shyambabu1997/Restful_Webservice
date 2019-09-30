package com.radhe.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerResource {
	
	public CustomerResource() {

		System.out.println("CustomerResource.0 param constructor");
	}
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response addCustomer(Customer customer) {
		
		System.out.println("addCustomer() method is called");
		System.out.println("addCustomer() is called");
		System.out.println(customer.getName());
		System.out.println(customer.getId());
		System.out.println(customer.getEmail());
		return Response.ok("Add Customer Successfully").build();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Customer getCustomer() {
		
		Customer c=new Customer();
		c.setEmail("radhe@gmail.com");
		c.setId(110);
		c.setName("Radhe");
		return c;
	}

}
