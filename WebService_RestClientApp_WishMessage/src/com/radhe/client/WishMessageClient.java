package com.radhe.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WishMessageClient {

	public static void main(String[] args) throws Exception {

		String resUrl="http://localhost:3030/WebService_RestEasy_App/rest/welcome";
		URL url=new URL(resUrl);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		int status=http.getResponseCode();
		
		if(status==200) {
			InputStream is=http.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			System.out.println(br.readLine());
			
		}
		else {
			System.out.println("Request failed to invoke resource method");
		}
	}

}
