package com.steff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Processor {

	@Scheduled(fixedDelay = 3000)
	public void getDataFronServer() {
		RestTemplate restTemplate = new RestTemplate();
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				ResponseEntity<String> value = restTemplate
						.getForEntity("https://messageservicesteffin.herokuapp.com/myName/Steffin", String.class);
				System.out.println("Scheduled Method Call : Value : " + value.getBody());
			}
		});
		//t.start();
		ResponseEntity<String> value = restTemplate
				.getForEntity("http://messageservicesteffin.herokuapp.com/myName/Steffin", String.class);
		System.out.println("Scheduled Method Call : Value : " + value.getBody());
	}
}
