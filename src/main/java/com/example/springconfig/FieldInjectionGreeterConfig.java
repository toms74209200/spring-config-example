package com.example.springconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration(proxyBeanMethods = false)
@Profile("field")
public class FieldInjectionGreeterConfig implements GreeterConfig {

	@Value("${greeter.message:}")
	private String message;

	@Override
	public String message() {
		return message;
	}
}
