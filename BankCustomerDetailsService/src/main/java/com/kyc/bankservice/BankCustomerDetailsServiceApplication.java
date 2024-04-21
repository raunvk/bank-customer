package com.kyc.bankservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.kyc.bankservice.repository.AadharCardProxy;
import com.kyc.bankservice.repository.PanCardProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {AadharCardProxy.class, PanCardProxy.class})
public class BankCustomerDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCustomerDetailsServiceApplication.class, args);
	}
}
