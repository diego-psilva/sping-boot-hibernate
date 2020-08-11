package com.company.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.course.entities.User;
import com.company.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}
	
	public User findById(long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

}