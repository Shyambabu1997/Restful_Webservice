package com.radhe.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/register")
public class RegisterProcessBeanParam {
	
		
		@POST
		@Path("/user")
		@Produces(MediaType.APPLICATION_JSON)
		public Response getRegisterDetails(@BeanParam User user)
		{		
			 
			String username = user.getUsername();
			String password = user.getPassword();
			
			System.out.println(username);
			System.out.println(password);
			
			return Response.ok().status(200).entity(user).build();
		}
}
