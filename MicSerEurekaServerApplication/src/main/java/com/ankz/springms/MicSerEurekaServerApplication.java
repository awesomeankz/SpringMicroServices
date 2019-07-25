package com.ankz.springms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicSerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicSerEurekaServerApplication.class, args);
	}

}
