package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.service.WelcomeService;

@RestController
public class WelcomeController {

	public WelcomeController() {

		System.out.println("WelcomeController.WelcomeController()");
	}

	@Autowired
	private WelcomeService service;
	
	@RequestMapping(value="/print",method=RequestMethod.GET)
	@ResponseBody
	public String printMsg() {
		System.out.println("WelcomeController.printMsg()");
		return service.invokeWelcomeMsg();
	}
	
}
