package com.samaraParcero.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samaraParcero.portfolio.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
