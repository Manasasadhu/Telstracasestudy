package com.example.postman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
@EntityScan(basePackages = "com.example.postman")
@ComponentScan(basePackages = "com.example.postman")
public class PostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostmanApplication.class, args);
	}

}
