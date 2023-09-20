package com.blog.entities;

import java.util.*;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Setter
@Getter
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;

	@Column(name = "title", length = 100, nullable = false)
	private String categoryTitle;

	@Column(name = "description")
	private String categoryDescription;

//	one category have many posts, but one post is mapped to single category only.
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // cascade mean save chlid automatically upon saiving
																// parent
	private List<Post> posts = new ArrayList<>();

}
