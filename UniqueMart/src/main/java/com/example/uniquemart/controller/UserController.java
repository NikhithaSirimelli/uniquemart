package com.example.uniquemart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.uniquemart.model.SignUp;

import com.example.uniquemart.service.UserService;

public class UserController {

	UserService userService;
	private SignUp signUp;
	public UserController(@Autowired UserService signUpService) {
		this.userService = userService;
	}
	@GetMapping("/signUp/{id}")
	public Iterable<SignUp>getAllItem() {
		return userService.findAll();
	}
	@PostMapping("/signUp")
	public SignUp save(@RequestBody SignUp SignUp) {
		return userService.save(signUp);
	}
	@DeleteMapping("/signUp/{id}")
	public void delete(@PathVariable int id) {
		userService.delete(id);
	}
	@PutMapping("/signUp")
	public SignUp update(@RequestBody SignUp item) {
		return userService.save(item);
	}
}
