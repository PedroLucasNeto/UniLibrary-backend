package br.com.UniLibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.UniLibrary.model.User;
import br.com.UniLibrary.services.UserService;

@RestController
@RequestMapping(value= "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody User user) {
		try {
			userService.createUser(user);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Created",HttpStatus.CREATED);
	}
	

}
