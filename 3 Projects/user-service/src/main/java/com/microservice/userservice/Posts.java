package com.microservice.userservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Posts {
	private String postId;
	private String postDes;	
}
