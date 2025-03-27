package com.rit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome Home";
	}

	@GetMapping("/page1")
	public String page1() {
		return "Welcome Page1";
	}

}

