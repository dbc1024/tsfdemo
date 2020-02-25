package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.tsf.annotation.EnableTsf;

@EnableTsf
@SpringBootApplication
public class TsfProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsfProviderApplication.class, args);
	}

}
