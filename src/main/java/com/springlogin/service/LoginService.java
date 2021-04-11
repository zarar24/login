package com.springlogin.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springlogin.model.Login;
import com.springlogin.repositry.LoginInterface;

public class LoginService {

	@Autowired
	private LoginInterface loginInterface ;

	
	public Login addCourse(Login course) {

		return loginInterface.save(course);
	}

}
