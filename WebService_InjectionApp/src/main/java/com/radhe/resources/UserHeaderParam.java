package com.radhe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserHeaderParam {
	
		@GET
		@Path("/get")
		public Response addUser(@HeaderParam("user-agent") String userAgent) {

			return Response.status(200)
					.entity("addUser is called, userAgent : " + userAgent)
					.build();

		}

	}
