package com.company.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
