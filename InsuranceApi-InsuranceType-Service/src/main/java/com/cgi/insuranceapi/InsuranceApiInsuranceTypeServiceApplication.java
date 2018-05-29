package com.cgi.insuranceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InsuranceApiInsuranceTypeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApiInsuranceTypeServiceApplication.class, args);
	}
}
