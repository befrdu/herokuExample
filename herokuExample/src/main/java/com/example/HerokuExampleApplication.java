package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = {"com.example.model"}) 
public class HerokuExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuExampleApplication.class, args);
	}
}
