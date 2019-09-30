package com.spring.boot.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeService {

	public WelcomeService() {

		System.out.println("WelcomeService.WelcomeService()");
	}
	String resUrl="http://localhost:3030//WebService_RestEasy_App//rest//welcome";
	public String invokeWelcomeMsg() {
		System.out.println("WelcomeService.invokeWelcomeMsg()");
		String msg=null;
		RestTemplate template=new RestTemplate(); 
		
		ResponseEntity<String> entity=template.getForEntity(resUrl,String.class);
		System.out.println("Status Code"+entity.getStatusCodeValue());
		if(entity.getStatusCode().equals(HttpStatus.OK));
		msg=entity.getBody();
		return msg;
	}
}