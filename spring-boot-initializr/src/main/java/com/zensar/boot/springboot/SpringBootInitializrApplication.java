package com.zensar.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScans(value = { @ComponentScan("com.test"),@ComponentScan("com.test1") })

public class SpringBootInitializrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitializrApplication.class, args);
	}

}
