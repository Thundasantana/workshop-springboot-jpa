package com.devlyon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlyon.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
