package com.example.springconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

@Profile({"default", "record"})
@ConfigurationProperties(prefix = "greeter")
public record RecordGreeterConfig(String message) implements GreeterConfig {}
