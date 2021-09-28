package com.ujjwa.test.spboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ujjwa.test")
public class Spboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spboot1Application.class, args);
	}

}
