package com.ankz.springms;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
public class MicSerConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx =  SpringApplication.run(MicSerConsumerApplication.class, args);
		
		
		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();

	}

	
/*	@Bean
	public ConsumerControllerClient consumerControllerClient()
	{
	return new ConsumerControllerClient();
	}*/
}
