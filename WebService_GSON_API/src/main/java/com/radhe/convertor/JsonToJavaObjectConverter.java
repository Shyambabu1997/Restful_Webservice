package com.radhe.convertor;


import java.io.FileReader;

import com.radhe.resource.Product;
import com.google.gson.Gson;


public class JsonToJavaObjectConverter {

	public static void main(String[] args) throws Exception {

		// pointing to json file data using reader
		FileReader fr = new FileReader("Product.json");

		// creating gson class object
		Gson gson = new Gson();

		// converting json file data to java object
		Product p = gson.fromJson(fr, Product.class);

		System.out.println(p);
	}

}
