package com.zensar.boot.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.boot.springboot.model.Product;

@RestController
public class ProductController {

	static List<Product> products=new ArrayList<>();
	
	static {
		Product product1=new Product(1,"Laptop",30000);
		Product product2=new Product(1,"Laptop",30000);
		products.add(product1);
		products.add(product2);
	}
	
	

	// @RequestMapping(value="/products",method=RequestMethod.GET)
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return products;
	}

}
