package com.samaraParcero.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samaraParcero.portfolio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
