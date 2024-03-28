package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.restapi")
public class SpringbootRestApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiProjectApplication.class, args);
	 
	}

}
