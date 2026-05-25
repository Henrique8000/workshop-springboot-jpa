package com.henriquedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
