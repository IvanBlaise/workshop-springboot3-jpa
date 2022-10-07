package com.businessnet.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.businessnet.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	

}
