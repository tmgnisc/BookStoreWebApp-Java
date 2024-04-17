package com.BookStoreLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookStoreLearning.entity.loginUser;

public interface userRepository extends JpaRepository<loginUser, Long> {
    loginUser findByUsername(String username);
}
