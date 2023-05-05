package com.polentzi.springstring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")


public class SpringString {
	@RequestMapping("")
	public String hello() {
		return "hello client!, how are u doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "springboot is great! so easy to just respond with strings";
	}
}