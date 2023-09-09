package com.javatechie.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable String id) {
		return service.getProductById(id);
	}

	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		 service.AddProduct(product);

	}

	@PutMapping("/products/{id}")
	public void updateProduct(@RequestBody Product product,@PathVariable String id) {
		 service.updateProduct(product,id);
	}

	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable String id) {
	 service.deleteProduct(id);
	}
}
