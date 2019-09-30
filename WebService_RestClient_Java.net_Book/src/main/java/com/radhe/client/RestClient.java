package com.radhe.client;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.radhe.domain.Book;

public class RestClient {
	
	String resUrl="http://localhost:3030/WebService_Book_Postman/rest/book";
	public RestClient() {
		

		System.out.println("RestClient.RestClient()");
	}
	
	public static void main(String[] args) throws Exception {
		
		//new RestClient().getBook();
		new RestClient().addBook();
		
	}
	
	public  void getBook() throws Exception {
		
		URL url=new URL(resUrl);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept","application/json");
		int status=http.getResponseCode();
		
		if(status==200) {
			InputStream is=http.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String jsonRes=br.readLine();
		
			if(jsonRes!=null) {
				ObjectMapper mapper=new ObjectMapper();
				
				/* to display in the console with method void return type and while loop
				 * System.out.println(jsonRes); jsonRes=br.readLine();
				 */
				Book b=mapper.readValue(jsonRes, Book.class);
				System.out.println(b);
			}
			
			
		}
		
		http.disconnect();
		
		
	}
	
	public void addBook() throws Exception{
	URL url=new URL(resUrl);
	
	HttpURLConnection http=(HttpURLConnection)url.openConnection();
	http.setRequestMethod("POST");
	http.setRequestProperty("Content-Type","application/json");
	
	Book b=new Book();
	b.setId(201);
	b.setName("Java");
	b.setPrice(200.00f);
	ObjectMapper mapper=new ObjectMapper();
	String bookJson=mapper.writeValueAsString(b);
	http.setDoOutput(true);
	
	OutputStream os=http.getOutputStream();
	os.write(bookJson.getBytes());
	os.flush();
	
	
	int status=http.getResponseCode();
	//System.out.println(status);
	if(status==200)
		System.out.println("Book added Successfully");
			}
	
	
}
