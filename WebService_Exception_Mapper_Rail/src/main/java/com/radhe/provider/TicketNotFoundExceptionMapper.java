package com.radhe.provider;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class TicketNotFoundExceptionMapper implements ExceptionMapper<TicketNotFoundException> {

	@Override
	@Produces(MediaType.TEXT_HTML)
	public Response toResponse(TicketNotFoundException tnfe) {
		System.out.println("Exception Mapper method called");
		System.out.println(tnfe.getMessage());
		ErrorMsg err = new ErrorMsg(400, tnfe.getMessage());

		return Response.status(Status.BAD_REQUEST).entity(err).type("application/xml").build();
	}
	
}
