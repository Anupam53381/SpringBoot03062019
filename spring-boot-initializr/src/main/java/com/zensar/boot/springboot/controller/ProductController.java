package com.zensar.boot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.boot.springboot.model.Product;
import com.zensar.boot.springboot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	// @RequestMapping(value="/products",method=RequestMethod.GET)
	@GetMapping("/products")
	public Iterable<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") int productId) {
		return productService.getProduct(productId);
	
	}
	
	@PostMapping("/products")
	public void insertProduct(@RequestBody Product product) {
		productService.insertProduct(product);
	}

}
