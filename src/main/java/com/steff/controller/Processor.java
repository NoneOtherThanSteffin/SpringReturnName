package com.steff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Processor {

	@Scheduled(fixedDelay = 600000)
	public void getDataFronServer() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> value = restTemplate
				.getForEntity("http://messageservicesteffin.herokuapp.com/myName/Steffin", String.class);
		System.out.println("Scheduled Method Call : Value : " + value.getBody());
	}
}
