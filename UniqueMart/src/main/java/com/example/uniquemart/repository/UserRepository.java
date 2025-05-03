package com.example.uniquemart.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.uniquemart.model.SignUp;

public interface UserRepository<T> extends CrudRepository<SignUp, String> {

}
