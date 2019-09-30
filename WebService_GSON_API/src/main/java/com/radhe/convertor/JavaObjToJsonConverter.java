package com.radhe.convertor;

import com.radhe.resource.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This class is used to convert java object to json string
 * 
 * @author Ashok
 *
 */
public class JavaObjToJsonConverter {

	public static void main(String[] args) {

		// create model class object
		Product p = new Product();

		// setting data to model class obj
		p.setPid(101);
		p.setName("Hard Disk");
		p.setPrice(4500.00);

		// Creating Gson class object
		Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();

		// Converting java obj to json string
		String jsonStr = gson.toJson(p);

		// printing json on console
		System.out.println(jsonStr);
	}

}
