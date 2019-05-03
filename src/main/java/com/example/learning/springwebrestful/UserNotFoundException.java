package com.example.learning.springwebrestful;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	protected UserNotFoundException(String messsage) {
		super(messsage);
	}

}
