package com.businessnet.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.businessnet.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	

}
