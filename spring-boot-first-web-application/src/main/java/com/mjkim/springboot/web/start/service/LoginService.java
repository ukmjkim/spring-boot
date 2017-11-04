package com.mjkim.springboot.web.start.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("mjkim") && password.equalsIgnoreCase("password");
	}
}
