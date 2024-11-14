package com.example.Spring9_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class Spring9GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring9GatewayApplication.class, args);
	}


}
