package com.microservice.nofificationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noti")
public class NotifictionController {
	@GetMapping("/{notfy_id}")
	public Notification getNotifi(@PathVariable String notfy_id) {
		Notification n=new Notification(notfy_id,"Notification Description "+notfy_id);
		return n;
	}
}
