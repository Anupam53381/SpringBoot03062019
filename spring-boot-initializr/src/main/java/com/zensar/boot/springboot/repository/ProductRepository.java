package com.zensar.boot.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.boot.springboot.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

}



// Repository
// CrudRepository
// PagingAndSortingRepository
// JpaRepository