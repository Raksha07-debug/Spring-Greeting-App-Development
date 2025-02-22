package com.example.greetigappdevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GreetigappdevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetigappdevelopmentApplication.class, args);
	}

}
