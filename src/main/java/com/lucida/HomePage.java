package com.lucida;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

	@GetMapping("/")
	public String home() {

		return "This is home page";
	}
}