package com.devlyon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlyon.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
