package com.radhe.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentFormParam {
	
	
		@POST
		@Path("/addStudent")
		public Response addStudent(@FormParam("sname") String name, @FormParam("semail") String email) {
			System.out.println("Name : " + name);
			System.out.println("Email : " + email);
			String resMsg = "Student added successfully with name : " + name;
			return Response.ok(resMsg).build();
		}
	}

