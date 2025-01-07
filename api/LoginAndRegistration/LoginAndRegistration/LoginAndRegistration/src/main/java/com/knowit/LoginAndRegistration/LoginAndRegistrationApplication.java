package com.knowit.LoginAndRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.knowit.LoginAndRegistration.*")
@EnableAutoConfiguration
public class LoginAndRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAndRegistrationApplication.class, args);
	}

}
