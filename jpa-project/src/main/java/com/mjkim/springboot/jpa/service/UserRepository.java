package com.mjkim.springboot.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjkim.springboot.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
