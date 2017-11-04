package com.mjkim.springboot.web.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mjkim.springboot.web.start.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		// model.put("name", name);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		boolean isValidUser = service.validateUser(name, password);
		if (!isValidUser) {
			model.put("message", "Input Password Again");
			return "login";
		} else {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
	}
}
