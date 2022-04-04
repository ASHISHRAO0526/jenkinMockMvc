package com.zensar.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/greet/{name}")
	public String createMessage(@PathVariable(name="name") String name) {
		System.out.println("Testing");
		return "Welcome to"+name.toUpperCase();
	}
	
	@PostMapping("/greet")
	public String createMessage() {
		return "Message Created";
	}

	@PostMapping
	public ResponseEntity<String> createdMessage(@RequestBody String msg)
	{
		System.out.println("message creating");
 		return new ResponseEntity<String>("Message Created"+ msg, HttpStatus.CREATED);
	}
	

}
