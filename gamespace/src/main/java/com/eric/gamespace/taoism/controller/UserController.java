package com.eric.gamespace.taoism.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

	@RequestMapping(value = "/")
	public String home() {
		return "Welcome to My GameSpace!";
	}
	
}
