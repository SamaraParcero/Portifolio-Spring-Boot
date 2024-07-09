package com.samaraParcero.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samaraParcero.portfolio.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
