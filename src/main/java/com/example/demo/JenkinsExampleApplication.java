package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsExampleApplication {

	private static final Logger LOGGER=Logger.getLogger(JenkinsExampleApplication.class.getName());

	@PostConstruct
	public void init() {
		LOGGER.info("Application is running now");
	}

	public static void main(String[] args) {
		LOGGER.info("Application Started with Success!!!!!!!!"+LOGGER.getName());
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

}
