package com.example.springconfig;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

class EnvironmentVariableGreeterConfigValidationTest {

	private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

	@Test
	void whenValidateEnvironmentVariableGreeterConfigWithEmptyMessageThenReturnsNotBlankViolation() {
		assertThat(validator.validate(new EnvironmentVariableGreeterConfig("")))
				.extracting(ConstraintViolation::getMessage)
				.containsExactly("must not be blank");
	}

	@Test
	void whenValidateEnvironmentVariableGreeterConfigWithMissingMessageThenReturnsNotBlankViolation() {
		assertThat(validator.validate(new EnvironmentVariableGreeterConfig(null)))
				.extracting(ConstraintViolation::getMessage)
				.containsExactly("must not be blank");
	}
}
