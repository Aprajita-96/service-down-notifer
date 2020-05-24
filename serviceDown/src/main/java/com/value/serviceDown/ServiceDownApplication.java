package com.value.serviceDown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class ServiceDownApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDownApplication.class, args);
	}

}
