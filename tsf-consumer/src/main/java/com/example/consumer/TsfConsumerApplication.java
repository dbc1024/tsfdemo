package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.tsf.annotation.EnableTsf;

@EnableFeignClients
@EnableTsf
@SpringBootApplication
public class TsfConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsfConsumerApplication.class, args);
	}

}
