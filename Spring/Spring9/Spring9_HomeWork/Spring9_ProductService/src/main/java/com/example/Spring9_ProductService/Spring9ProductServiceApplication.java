package com.example.Spring9_ProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Spring9ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring9ProductServiceApplication.class, args);
	}



}
