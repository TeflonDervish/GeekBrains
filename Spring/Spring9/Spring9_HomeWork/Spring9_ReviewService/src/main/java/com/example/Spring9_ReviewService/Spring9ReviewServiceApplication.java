package com.example.Spring9_ReviewService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Spring9ReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring9ReviewServiceApplication.class, args);
	}

}
