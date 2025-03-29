package com.rajesh.klp.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Object dataSource = context.getBean ("dataSource");
		logger.debug("------Data Source   :----"+ dataSource);
		System.out.println("------Data Source   :----"+ dataSource);
	}

}
