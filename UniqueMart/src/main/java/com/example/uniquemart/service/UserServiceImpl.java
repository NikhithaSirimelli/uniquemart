package com.example.uniquemart.service;

import java.util.Optional;

import org.apache.catalina.User;

import com.example.uniquemart.model.SignUp;
import com.example.uniquemart.repository.UserRepository;

public class UserServiceImpl implements UserService {

	UserRepository userRepository;
	private User theSignUp;
	 
	 

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Optional<SignUp> result =  userRepository.findById(id);
		
		 SignUp theSignUp = null;
		
		if (result.isPresent()) {
			theSignUp = result.get();
		}
		else {
			// we didn't find the  Post
			throw new RuntimeException("Did not find   signinto id - " + id);
		}
		
		
		return  (User) theSignUp;
	}
	

	@Override
	public Iterable<SignUp> findAll() {
		// TODO Auto-generated method stub
	 	return userRepository.findAll();
	}

	@Override
	public SignUp save(SignUp signUp) {
		// TODO Auto-generated method stub
		return (SignUp) userRepository.save(signUp);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
}
	
	
	
	
	
	
	
	
	
	