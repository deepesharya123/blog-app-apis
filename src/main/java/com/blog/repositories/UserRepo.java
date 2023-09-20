package com.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.User;

// JPA repository is responsible for saving, updating and fetching from db

public interface UserRepo extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
}
