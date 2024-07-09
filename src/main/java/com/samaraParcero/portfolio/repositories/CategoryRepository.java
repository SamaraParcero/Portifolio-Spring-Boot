package com.samaraParcero.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samaraParcero.portfolio.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
