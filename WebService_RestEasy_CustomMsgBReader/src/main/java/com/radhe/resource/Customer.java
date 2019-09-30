package com.radhe.resource;

public class Customer {

	private String name;
	private int id;
	private String email;
	public Customer() {

		System.out.println("Customer.0 param constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", id=" + id + ", email=" + email + "]";
//	}
	
}
