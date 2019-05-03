package com.example.learning.springwebrestful.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.springwebrestful.components.User;

@Service
public class UserService {

	private static List<User> userList = new ArrayList<>();
	private int usrId = 3;
	
	static {
		userList.add(new User(1, "Sandeep", "IT"));
		userList.add(new User(2, "Kuldeep", "IT"));
		userList.add(new User(3, "Anu", "Student"));
	}
	
	public User getUserById(int id) {
		for(User usr: userList) {
			if(usr.getId() == id) {
				return usr;
			}
		}
		 return null;
	}
	
	public List<User> getAllUsers(){
		return userList;
	}
	
	public User saveUser(User user) {
		if(user.getId() == null) {
			user.setId(++usrId);
			userList.add(user);
		}
		return user;
	}

}
