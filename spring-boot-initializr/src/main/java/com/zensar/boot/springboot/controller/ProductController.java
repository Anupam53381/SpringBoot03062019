package com.zensar.boot.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.boot.springboot.model.Product;

@RestController
public class ProductController {

	/*
	 * @RequestMapping("/") public String sayHello() { return "<h1>hello</h1>"; }
	 */

	// http://localhost:8080/products->enter

	// @RequestMapping(value="/products",method=RequestMethod.GET)
	@GetMapping("/product")
	public Product getAllProducts() {
		return new Product(10, "Laptop", 45000);
	}

}
