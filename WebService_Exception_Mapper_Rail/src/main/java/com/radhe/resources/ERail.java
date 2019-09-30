package com.radhe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.radhe.domain.Ticket;
import com.radhe.provider.TicketNotFoundException;

@Path("rail")
@Produces(MediaType.TEXT_XML)
public class ERail {
	@GET
	@Path("{pnr}")
	public Response getPnrStatus(@PathParam("pnr") String pno)  throws TicketNotFoundException{
		System.out.println("Pnr Status method is called");
		Ticket t=new Ticket();
		t.setId(111);
		t.setPnr("1234");
		t.setStatus("Confirmed");
		int tno=Integer.parseInt(pno);
		if(tno!=1234) {
			throw new TicketNotFoundException();
		}
		Response response = Response.ok(t).build();
		return response;
	}

}
