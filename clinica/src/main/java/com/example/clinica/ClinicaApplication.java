package com.example.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ClinicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApplication.class, args);
	}

}
