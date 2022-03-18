package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSetterExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSetterExampleApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfigure.class);

		Store store = context.getBean(Store.class);
		store.getStore();
		
	}

}