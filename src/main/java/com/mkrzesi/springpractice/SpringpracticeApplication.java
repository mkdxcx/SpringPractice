package com.mkrzesi.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringpracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringpracticeApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext();

	}
}
