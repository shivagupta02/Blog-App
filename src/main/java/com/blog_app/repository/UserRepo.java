package com.blog_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_app.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	Optional<User> findByEmail(String email);
	User getUserByName(String userName);

}
