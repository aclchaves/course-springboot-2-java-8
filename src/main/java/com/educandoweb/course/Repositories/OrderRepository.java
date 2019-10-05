package com.educandoweb.course.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	List<Order> findByClient(User client);

}
