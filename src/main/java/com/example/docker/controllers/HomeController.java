package com.example.docker.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.service.UserService;

@RestController
@RequestMapping("api/")
public class HomeController {
	
	@Autowired
	UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<String> getUserList() {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
    @GetMapping("/getDetails")
    public ResponseEntity<String> getDetails() {
    	String name = userService.getName();
    	return new ResponseEntity<>(name, HttpStatus.OK);
    }

	

}
