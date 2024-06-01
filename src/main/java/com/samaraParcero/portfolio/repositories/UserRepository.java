package com.samaraParcero.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samaraParcero.portfolio.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
