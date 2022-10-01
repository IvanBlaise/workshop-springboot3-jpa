package com.businessnet.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.businessnet.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	

}
