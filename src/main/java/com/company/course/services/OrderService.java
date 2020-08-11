package com.company.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.course.entities.Order;
import com.company.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		
		return orderRepository.findAll();
	}
	
	public Order findById(long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}

}
