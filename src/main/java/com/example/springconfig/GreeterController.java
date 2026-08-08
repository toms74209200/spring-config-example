package com.example.springconfig;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

	private final GreeterConfig config;

	public GreeterController(GreeterConfig config) {
		this.config = config;
	}

	@GetMapping("/greet")
	public Map<String, String> greet(@RequestParam(defaultValue = "world") String name) {
		return Map.of("greeting", config.message() + ", " + name);
	}
}
