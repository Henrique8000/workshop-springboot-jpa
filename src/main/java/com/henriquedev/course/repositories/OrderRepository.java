package com.henriquedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
