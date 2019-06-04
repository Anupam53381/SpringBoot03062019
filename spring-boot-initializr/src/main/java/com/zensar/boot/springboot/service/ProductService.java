package com.zensar.boot.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.boot.springboot.model.Product;
import com.zensar.boot.springboot.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	
	public Product getProduct(@PathVariable("id") int productId) {
		return productRepository.findById(productId).get();
	}
	
	
	public void insertProduct(Product product) {
		productRepository.save(product);
	}


}
