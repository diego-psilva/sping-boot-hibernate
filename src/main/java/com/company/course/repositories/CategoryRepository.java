package com.company.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
