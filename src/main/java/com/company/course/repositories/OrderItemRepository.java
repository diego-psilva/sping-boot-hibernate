package com.company.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
