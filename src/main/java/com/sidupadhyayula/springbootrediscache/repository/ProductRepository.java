package com.sidupadhyayula.springbootrediscache.repository;

import com.sidupadhyayula.springbootrediscache.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
