package com.radhe.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.radhe.domain.User;

@Service(value = "service")
public class UserServiceImpl implements UserService {

	//This is used to Store Users data (In Memory)
	private static Map<Integer, User> usersData = new HashMap<Integer, User>();

	
	public boolean add(User user) {
		if (usersData.containsKey(user.getUserid())) {
			return false;
		} else {
			usersData.put(user.getUserid(), user);
			return true;
		}
	}

	
	public User get(String uid) {
		System.out.println(usersData);
		if (usersData.containsKey(Integer.parseInt(uid))) {
			return usersData.get(Integer.parseInt(uid));
		}
		return null;
	}

	
	public boolean update(String uid, User user) {
		if (usersData.containsKey(Integer.parseInt(uid))) {
			usersData.put(Integer.parseInt(uid), user);
			return true;
		}
		return false;
	}

	
	public boolean delete(String uid) {
		if (usersData.containsKey(Integer.parseInt(uid))) {
			usersData.remove(usersData.get(Integer.parseInt(uid)));
			return true;
		}
		return false;
	}

}