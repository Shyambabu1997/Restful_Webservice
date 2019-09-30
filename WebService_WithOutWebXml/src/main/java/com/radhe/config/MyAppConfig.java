package com.radhe.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.radhe.resources.WishMessage;

@ApplicationPath("/api/*")
public class MyAppConfig extends Application {
	public MyAppConfig() {


		System.out.println("MyAppConfig::0 param constructor");
	}
	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(WishMessage.class);
		return s;
	}
	@Override
	public Map<String, Object> getProperties() {

		Map<String,Object> map=new HashMap<>();
		map.put("jersey.config.server.provider.packages","com.radhe.resources");
		return map;
	}
	

	@Override
	public Set<Object> getSingletons() {

		System.out.println("getSingletons() method called");
		Set<Object> set=new HashSet<>();
		set.add(new WishMessage());
		return set;
	}
}
