package com.lwebapp.spring.postgresql.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	// ref:https://spring.io/guides/gs/rest-service-cors/
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMapping(CorsRegistry registry) {
				registry.addMapping("/api")
				.allowedOrigins("http://localhost:3000")
				.allowedMethods("PUT", "DELETE")
				.allowedHeaders("")
				.exposedHeaders("")
				.allowCredentials(true)
				.maxAge(3600);
			}
		};
	}
}
