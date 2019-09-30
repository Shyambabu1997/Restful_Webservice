package com.spring.boot.pojo;

import org.springframework.hateoas.ResourceSupport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author extends ResourceSupport {
	
	private int authorId;
	private String authorName;

}
