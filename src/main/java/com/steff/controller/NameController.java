package com.steff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

	@GetMapping("/saymyname")
	public String getMessage(@RequestParam(value = "name") String name) {
		return ("Hello " + name);
	}
}
