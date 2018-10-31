package com.home.HotelAppGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class HotelAppGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelAppGradleApplication.class, args);
	}
}
