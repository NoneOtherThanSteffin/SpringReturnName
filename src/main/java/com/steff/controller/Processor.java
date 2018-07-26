package com.steff.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Processor {

	@Scheduled(fixedDelay = 3000)
	public void getDataFronServer() {
		System.out.println("Scheduled Method Call");
	}
}
