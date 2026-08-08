package com.example.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringConfigExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigExampleApplication.class, args);
	}

}
