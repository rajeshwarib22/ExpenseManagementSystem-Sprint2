package com.cg.UserLoginDataProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserLoginDataProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLoginDataProviderApplication.class, args);
	}

}
