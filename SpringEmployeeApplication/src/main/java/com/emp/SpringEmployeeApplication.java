package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringEmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeApplication.class, args);
	}

}
