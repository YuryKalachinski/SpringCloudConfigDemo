package com.kalachinski.springCloudConfigClientDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudConfigClientDemoApplication {

	@Value("${user.role}")
	private String role;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientDemoApplication.class, args);
	}

	@GetMapping("/whoAreYou/{username}")
	public String whoAreUou(@PathVariable String username) {
		return username + " " + role;
	}
}
