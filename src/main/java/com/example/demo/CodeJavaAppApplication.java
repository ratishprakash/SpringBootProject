package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo"}) 
public class CodeJavaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeJavaAppApplication.class, args);
	}

}
