package com.radhe.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.radhe.domain.Ticket;
import com.radhe.resources.ERail;

@ApplicationPath("/api/*")
public class MyConfig extends Application {
	public MyConfig() {

		System.out.println("MyConfig.0 param constructor");
	}
	@Override
	public Set<Object> getSingletons() {

		System.out.println("getSingletons() method called");
		Set<Object> set=new HashSet<>();
		set.add(new Ticket());
		set.add(new ERail());
		return set;
	}

}
