package com.lucida.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController
{

	@GetMapping("/")
	public String home() {

		return "This is home page";
	}
}