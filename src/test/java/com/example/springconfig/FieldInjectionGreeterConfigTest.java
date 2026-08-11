package com.example.springconfig;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles("field")
class FieldInjectionGreeterConfigTest {

	@Autowired
	GreeterConfig config;

	@Test
	void whenReadMessageWithFieldInjectionConfigThenReturnsProfileDocumentValue() {
		assertThat(config.message()).isEqualTo("Hi from field injection");
	}
}
