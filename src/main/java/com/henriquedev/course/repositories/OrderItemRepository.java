package com.henriquedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.course.entities.OrderItem;
import com.henriquedev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
