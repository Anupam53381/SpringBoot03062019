package com.zensar.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScans(value = { @ComponentScan("com.test"),@ComponentScan("com.test1") })
//implements CommandLineRunner 
public class SpringBootInitializrApplication {
	

	
	/*@Autowired
	private  ProductService service;
*/
	public static void main(String[] args) {
		
	
		//SpringApplication.run(SpringBootInitializrApplication.class, args);
		
		/*SpringApplicationBuilder sb=new SpringApplicationBuilder(SpringBootInitializrApplication.class);
		sb.build("")
		
		sb.run(args);*/
		
	/*	new SpringApplicationBuilder(SpringBootInitializrApplication.class)
		.properties("spring.config.name:abc")
		.build()
		.run(args);*/
		
	//	ConfigurableApplicationContext config = SpringApplication.run(SpringBootInitializrApplication.class, args);
	
		
		//ProductService service=(ProductService)config.getBean("service");
		
	//	ProductService service=config.getBean("productService",ProductService.class);
		
		
		
		SpringApplication.run(SpringBootInitializrApplication.class, args);
		
		
	
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		Product product = new Product();
		product.setProductName("TV");
		product.setProductCost(150000);
		
		service.insertProduct(product);
		
	}*/

}
