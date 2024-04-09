package com.microservice.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{user_id}")
	public UserEn getUser(@PathVariable String user_id) {
		UserEn u=new UserEn(user_id," Username : Vivek"," XXX "+user_id);
		
		Posts p=restTemplate.getForObject("http://localhost:8082/post/121011", Posts.class);
		Notification n=restTemplate.getForObject("http://localhost:8083/noti/123", Notification.class);
		
		u.setPosts(p);
		u.setNotify(n);
		
		return u;
	}
}
