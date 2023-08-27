package com.demo.UnitTestingTrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition
public class UnitTestingTrialApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingTrialApplication.class, args);
	}

}
