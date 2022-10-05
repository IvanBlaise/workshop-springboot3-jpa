package com.businessnet.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.businessnet.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	

}
