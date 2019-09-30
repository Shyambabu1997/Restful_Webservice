package com.radhe.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class BookApacheClient {

	public static void main(String[] args) throws Exception {
		String restUrl="http://localhost:3030/WebService_Book_Postman/rest/book";
		
		DefaultHttpClient client=new DefaultHttpClient();
		HttpGet getRequest=new HttpGet(restUrl);
		getRequest.addHeader("Accept","application/json");
		
		
		InputStream is=client.execute(getRequest).getEntity().getContent();
		InputStreamReader isr=new InputStreamReader(is);
		
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
	}

}
