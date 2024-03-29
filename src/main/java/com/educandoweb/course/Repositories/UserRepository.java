package com.educandoweb.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
