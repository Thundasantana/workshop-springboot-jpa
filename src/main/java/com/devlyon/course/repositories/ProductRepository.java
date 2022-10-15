package com.devlyon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlyon.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
