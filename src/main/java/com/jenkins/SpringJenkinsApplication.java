package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started.....");
	}

	@GetMapping("/hi")
	public String disp() {
		return "Welcome to java Aliens";
	}

	public static void main(String[] args) {

		logger.info("Application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
