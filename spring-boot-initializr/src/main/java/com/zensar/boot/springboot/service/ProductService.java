package com.zensar.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.boot.springboot.model.Product;
import com.zensar.boot.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	
	public Product getProduct( int productId) {
		return productRepository.findById(productId).get(); //2.0.5
		//return productRepository.findOne(productId);
	}
	
	
	public void insertProduct(Product product) {
		productRepository.save(product);
		
	}


}
