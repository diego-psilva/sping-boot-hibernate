package com.company.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
