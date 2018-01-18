package com.BaltaJuanTesis.demoBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ListObjetivosApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ListObjetivosApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ListObjetivosApplication.class);
	}
}
