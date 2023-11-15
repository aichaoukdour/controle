package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.entities")
public class ControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

}
