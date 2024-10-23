package com.blog_app.payload;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostResponse {
	
	private List<PostDto> content;

	private Integer pageNumber;
	
	private Integer pageSize;
	
	private Integer totalElement;
	
	private Integer totalPage;
	
	private Integer latsPage;

}
