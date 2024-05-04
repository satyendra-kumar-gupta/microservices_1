package com.saty.dockerTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDocker {
	
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "test docker";
	}

}