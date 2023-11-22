package com.SpringEmployee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.SpringEmployee.demo")
public class EmployeeBackendProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeBackendProjApplication.class, args);
	}

}
