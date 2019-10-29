package com.educandoweb.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
