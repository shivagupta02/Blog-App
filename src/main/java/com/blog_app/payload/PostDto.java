package com.blog_app.payload;

import java.sql.Date;
import java.time.LocalDate;

import com.blog_app.entity.Category;
import com.blog_app.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	
	private String postId;

	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date
	addedDate;
	
	private UserDto user;
	
	private CategoryDto category;
}
