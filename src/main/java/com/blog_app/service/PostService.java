package com.blog_app.service;

import java.util.List;

import com.blog_app.entity.Post;
import com.blog_app.payload.PostDto;

public interface PostService {

	//create post
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	//update post
	PostDto updatePost(PostDto postDto, Integer postId);
	//delete post
	void deletePost(Integer postId);
	//get single post
	PostDto getPostById(Integer postId);
	//get all the post 
	List<PostDto> getAllPost(Integer pageNumber , Integer pageSize, String sortBy);
	//get all the post by category id
	List<PostDto> getPostByCategory(Integer categoryId);
	//get all the post by user id
	List<PostDto> getPostByUser(Integer userId);
	//search post
	List<Post> searchPost(String keyword);
	
}
