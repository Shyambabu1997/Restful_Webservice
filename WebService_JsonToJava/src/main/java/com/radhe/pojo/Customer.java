package com.radhe.pojo;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.map.ser.std.DateSerializer;

@JsonSerialize(include = Inclusion.NON_NULL)
@JsonPropertyOrder({"id","name","email"})
public class Customer {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("dob")
	@JsonSerialize(using=DateSerializer.class)
	private Date dob;
	
	public Customer(int id, String name, String email,Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob=dob;
	}
	 public Customer() {

		 System.out.println("Customer 0 param constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}
	

}
