package com.alurachallenge.foro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.alurachallenge.foro.domain")
@SpringBootApplication
public class ForoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForoApplication.class, args);
	}

}
