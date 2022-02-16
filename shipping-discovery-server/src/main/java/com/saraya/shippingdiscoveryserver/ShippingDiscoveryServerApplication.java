package com.saraya.shippingdiscoveryserver;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 

@SpringBootApplication
@EnableEurekaServer
public class ShippingDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingDiscoveryServerApplication.class, args);
	}

}
