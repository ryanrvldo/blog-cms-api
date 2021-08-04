package com.ryanrvldo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(
		basePackages = {
				"com.ryanrvldo.core",
				"com.ryanrvldo.controller",
				"com.ryanrvldo.service",
		}
)
@EnableJpaRepositories(basePackages = "com.ryanrvldo.persistence")
@EntityScan(basePackages = "com.ryanrvldo.persistence")
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
