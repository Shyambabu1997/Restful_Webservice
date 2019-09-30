package com.radhe.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	
	private int id;
	private String name;
	private float price;
	
	public Book(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Book() {

		System.out.println("Book.Book()");
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
