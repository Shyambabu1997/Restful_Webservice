package com.radhe.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.radhe.filter.SecurityFilter;
import com.radhe.resource.BookResource;


@ApplicationPath(value = "/rest/*")
public class AppConfig extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> objs = new HashSet<Object>();
		objs.add(new BookResource());
		return objs;

	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(SecurityFilter.class);
		return classes;
	}
	
	}
