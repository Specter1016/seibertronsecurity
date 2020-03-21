package com.seibertronsecurity.seibertronsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SeibertronsecurityApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SeibertronsecurityApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SeibertronsecurityApplication.class, args);
	}

}
