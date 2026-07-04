package com.spring.security.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping("/helo")
	public String home() {
		return "spring security";
	}
}
