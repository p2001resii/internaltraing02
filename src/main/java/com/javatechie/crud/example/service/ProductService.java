package com.javatechie.crud.example.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;

@Service
public class ProductService {
	
    @Autowired
    ProductRepository repository;

	public List<Product> getAllProducts() {  

		List<Product> ProductList =new ArrayList();
		repository.findAll().forEach(ProductList::add);
		return ProductList;
	}

	public Product getProductById(String id) {

		return repository.findById(id).get();
		
	}

	public void AddProduct(Product product) {
		repository.save(product);
	}

	public void updateProduct(Product product, String id) {
		repository.save(product);
	}

	public void deleteProduct(String id) {

	 repository.deleteById(id);
	
		
	}
    
   
}
