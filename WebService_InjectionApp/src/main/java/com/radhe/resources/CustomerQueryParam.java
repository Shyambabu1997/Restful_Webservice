package com.radhe.resources;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
@Path("/customer")
public class CustomerQueryParam {
	
	public CustomerQueryParam() {


		System.out.println("CustomerQueryParam:: 0 Param Constructor");
	}
	@GET
	@Path("/findcustomer")
	public String findCustomer(@DefaultValue("cid=123")@QueryParam("cid") String cid) {
		System.out.println("findCustomer () called");
		System.out.println("Customer Id"+cid);
		return "Shyam";
	}
	
	@GET
	@Path("/findcustomerbyid")
	public String findCustomerById(@QueryParam("cid") String cid,
									@QueryParam("cname") String name) {
		
		System.out.println("findCustomerById() called");
		System.out.println(cid);
		System.out.println(name);
		return "Shyam";
	}
	@GET
	@Path("/findcustomers")
	public String findCustomers(@Context UriInfo info ) {
		System.out.println("findCustomers() called");
		MultivaluedMap<String,String> map=info.getQueryParameters();
		List<String> list=map.get("cid");
		System.out.println(list);
		
		
		return "uriinfo method called";
	}

}
