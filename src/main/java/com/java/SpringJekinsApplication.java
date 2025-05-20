package com.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJekinsApplication {
	public static Logger logger=LoggerFactory.getLogger(SpringJekinsApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Applicatoion started...!!");
	}
	public static void main(String[] args) {
		logger.info("Application executed...!!");
		SpringApplication.run(SpringJekinsApplication.class, args);
	}

}
