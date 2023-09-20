package com.blog.payloads;

import java.util.*;

import com.blog.entities.Category;
import com.blog.entities.Comment;
import com.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PostDto {
	private String title;
	private String content;
	
	private String imageName;
	private Date addedDate;

	private CategoryDto category;
	private UserDto user;

	private Set<CommentDto> comments = new HashSet<>();
	
}
