package com.cg.ExpenseManagemetServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ExpenseManagemetServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagemetServerApplication.class, args);
	}

}
