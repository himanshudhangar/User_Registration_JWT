package com.bridgelabz.userregitrationjwt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication

public class UserregistrationJwtApplication {

	public static void main(String[] args) {
		System.out.println("Welcome To User Registration App");
		SpringApplication.run(UserregistrationJwtApplication.class, args);

	}
	/*
	 * Method :- Method to Configure Swagger.
	 */

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.bridgelabz.empPayrollServiceApp.EmpPayrollServiceApp"))
				.build();
	}

}
