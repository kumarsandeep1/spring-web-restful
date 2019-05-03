package com.example.learning.springwebrestful;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.learning.springwebrestful.components.User;
import com.example.learning.springwebrestful.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{id}")
	public User getUserByID(@PathVariable int id) {
		User user = userService.getUserById(id);
		if(user ==null) {
			throw new UserNotFoundException(Integer.toString(id));
		}
		return user;
	}
	
	@GetMapping("/findalluser")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping(path="/saveuser")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.ok().build();
	}

}
