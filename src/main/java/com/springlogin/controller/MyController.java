package com.springlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springlogin.model.Login;
import com.springlogin.service.LoginService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

@CrossOrigin(origins = "*")
@RestController
public class MyController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public Login addCourse(@RequestBody Login login) {
		System.out.println("Controller login"+login);
		return this.loginService.addCourse(login);
	}

}
