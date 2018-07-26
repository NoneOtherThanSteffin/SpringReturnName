package com.steff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringReturnNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReturnNameApplication.class, args);
	}

}
