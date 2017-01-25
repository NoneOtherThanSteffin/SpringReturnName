package com.steff.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController {
	@RequestMapping("/myName/{name}")
	public String getMessage(@PathVariable(value = "name") String name) {
			return ("Hello " + name);
	}
}
