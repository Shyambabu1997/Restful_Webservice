package com.radhe.resources;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/cookie")
public class CustomerCookieParam {
	
	@GET
	@Path("/add")
	public Response writeCookie() {
		
		NewCookie cook=new NewCookie("name","radhe");
		NewCookie cook2=new NewCookie("email","radhe@gmail.com");
		ResponseBuilder rb=Response.ok("Cookie Added Successfully");
		rb.cookie(cook,cook2);
		return rb.build();
		
	}
	@GET
	@Path("/get")
	public Response readWrite(@CookieParam("name") String name) {
		
		System.out.println("Cookie Values are"+name);
		
		return Response.ok("Cookie Retrived Successfully").build();
		
	}
	@GET
	@Path("/getall")
	public Response getallCookies(@Context HttpHeaders httpHeaders) {
		Map<String, Cookie> cookies = httpHeaders.getCookies();
		
		String responseMsg  =  cookies.entrySet().stream()
		  .map(e -> e.getKey()+" = "+e.getValue().getValue())
		  .collect(Collectors.joining("<br/>"));
		
		
		

return Response.ok(responseMsg).build();
	}		

}
