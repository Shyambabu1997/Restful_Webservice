package com.radhe.resource;

import java.beans.Transient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

	@SerializedName("product-id")
	@Expose
	private Integer pid;

	@Expose
	private String name;

	@Expose
	private Double price;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

}
