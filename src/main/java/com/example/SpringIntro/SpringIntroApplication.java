package com.example.SpringIntro;

import components.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringIntroApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Spring Boot Application...");
		ApplicationContext context = SpringApplication.run(SpringIntroApplication.class, args);
		logger.debug("Checking Context:{}",context.getBean(DemoBean.class));


	}


}
