package com.example.springconfig;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.validation.annotation.Validated;

@Profile("envvar")
@Validated
@ConfigurationProperties(prefix = "greeter")
public record EnvironmentVariableGreeterConfig(@NotBlank String message) implements GreeterConfig {}
