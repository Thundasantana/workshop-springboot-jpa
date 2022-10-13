package com.devlyon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlyon.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
