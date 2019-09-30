package com.radhe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/welcome")
public class WelcomeResource {
	
	public WelcomeResource() {
	
		System.out.println("Welocme Resource 0 param constructor");
	}
	
	@GET
	//@Path("/wish")
	public String wishMessage() {
		System.out.println("wishMessage() called ");
		return "Welcome to RestEasy API";
	}

}

