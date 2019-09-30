package com.radhe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/car")
public class CarResource {

	@GET
	@Path("{brand}/{model}")
	//@Produce()
	public Response bookCar(@PathParam("brand") String brand,
						  @PathParam("model") String model,
						  @MatrixParam("color") String color) {
		System.out.println("bookCar() method is called");
		return Response.ok(200).entity("Car Details"+brand+"--"+model+"--"+color).build();
	}

}