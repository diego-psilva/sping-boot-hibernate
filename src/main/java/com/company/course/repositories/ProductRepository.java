package com.company.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
