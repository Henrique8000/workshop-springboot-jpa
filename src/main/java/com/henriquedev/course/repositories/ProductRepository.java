package com.henriquedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
