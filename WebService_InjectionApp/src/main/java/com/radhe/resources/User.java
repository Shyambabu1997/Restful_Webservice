package com.radhe.resources;

import javax.ws.rs.FormParam;


public class User {
	@FormParam("user")
	private String username;
	
	@FormParam("pass")
	private String password;
 
	public String getUsername()
	{
	
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
}

