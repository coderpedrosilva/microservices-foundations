package com.example.controledepessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ControleDePessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDePessoasApplication.class, args);
	}

}
