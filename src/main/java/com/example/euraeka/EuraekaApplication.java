package com.example.euraeka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuraekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuraekaApplication.class, args);
	}

}
