package com.SpingBootexample.SpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
	
	@GetMapping("/msg")
	public String getMessage() {
		return "hello world";
	}

}
