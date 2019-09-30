package com.radhe.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("welcome")
public class WishMessage {
	
	@GET
	public String showMessage() {
		
		return "Welcome To Hyderbad";
		
	}

}
