package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtTokenGenerationServiceApplication {

	public static void main(String[] args) {
		/*BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode("tej123");
		System.out.println("Password: " + encodedPassword);*/
		SpringApplication.run(JwtTokenGenerationServiceApplication.class, args);
	}

}
