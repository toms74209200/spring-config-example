package com.example.springconfig;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class RecordGreeterConfigTest {

	@Autowired
	GreeterConfig config;

	@Test
	void whenReadMessageWithRecordConfigThenReturnsYamlValue() {
		assertThat(config.message()).isEqualTo("Hi from the record");
	}
}
