package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
//
//import com.Controller.demo.EmployeeController;

@SpringBootApplication
public class SpringbootRestApiProject2Application {
 
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootRestApiProject2Application.class, args);
		 System.out.println("hello");
//		 EmployeeController EmployeeController=contaxt.getBean(EmployeeController.class);
//		 System.out.println(EmployeeController.get());
	}

}
