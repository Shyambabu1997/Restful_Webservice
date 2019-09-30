package com.radhe.provider;

import javax.annotation.Resource;
import javax.ws.rs.ext.Provider;


public class TicketNotFoundException extends Exception {

	public TicketNotFoundException() {

		System.out.println("0 param constructor");
	}

	public TicketNotFoundException(String message) {
		super(message);

		System.out.println("1 param contructor");
	}

	
}
