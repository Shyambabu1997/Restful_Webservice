package com.radhe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/wish")
//@Singleton
public class WishMessage {
	
	public WishMessage() {

		System.out.println("WishMessage.0 param constructor");
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response generateWish() {
		System.out.println("generateWish() is called");
		Response res=Response.ok("<H1><CENTER>-----GOOD MORNING-----</CENTER></H1>").build();
		
		return res;
	}

}
