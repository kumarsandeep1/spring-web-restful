package com.example.learning.springwebrestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.springwebrestful.components.User;
import com.example.learning.springwebrestful.service.UserService;

@RestController
public class HelloWorldController {
	
	
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		return "hello world 1";
	}

	@GetMapping(path="/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hello world bean");
	}
	
	
}
