package com.insure.tech.api.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InsureTechDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsureTechDiscoveryServiceApplication.class, args);
	}

}
