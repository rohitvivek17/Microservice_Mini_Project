package com.microservice.userservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserEn {
	private String user_id;
	public UserEn(String user_id, String user_name, String user_phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_phone = user_phone;
	}
	private String user_name;
	private String user_phone;
	
	private Posts posts;
	private Notification notify;
	
	
}
