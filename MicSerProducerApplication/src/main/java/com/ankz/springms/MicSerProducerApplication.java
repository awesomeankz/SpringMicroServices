package com.ankz.springms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicSerProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicSerProducerApplication.class, args);
	}

}
