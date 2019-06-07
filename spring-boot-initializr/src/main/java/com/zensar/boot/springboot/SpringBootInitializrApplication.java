package com.zensar.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScans(value = { @ComponentScan("com.test"),@ComponentScan("com.test1") })

public class SpringBootInitializrApplication {
	
	

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootInitializrApplication.class, args);
		
		/*SpringApplicationBuilder sb=new SpringApplicationBuilder(SpringBootInitializrApplication.class);
		sb.build("")
		
		sb.run(args);*/
		
		new SpringApplicationBuilder(SpringBootInitializrApplication.class)
		.properties("spring.config.name:abc")
		.build()
		.run(args);
	
	}

}
