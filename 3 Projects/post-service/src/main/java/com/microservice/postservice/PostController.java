package com.microservice.postservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
	@GetMapping("/{post_id}")
	public Posts getPosts(@PathVariable String post_id) {
		Posts p=new Posts(post_id,"This Describe for Posts..."+post_id);
		return p;		
	}
}
