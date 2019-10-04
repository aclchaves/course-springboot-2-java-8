package com.educandoweb.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
