package com.example.uniquemart.service;

import org.apache.catalina.User;

import com.example.uniquemart.model.SignUp;

public interface UserService {

	User findById(int id);

	Iterable<SignUp> findAll();

	SignUp save(SignUp signUp);

	void delete(int id);

}
