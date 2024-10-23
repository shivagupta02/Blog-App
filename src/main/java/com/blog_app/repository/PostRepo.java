package com.blog_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_app.entity.Category;
import com.blog_app.entity.Post;
import com.blog_app.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
//	org.springframework.data.domain.Page<Post> findAll(Pageable pageable);
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
	