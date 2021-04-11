package com.springlogin.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springlogin.model.Login;


public interface LoginInterface extends JpaRepository <Login,Integer>{

}
