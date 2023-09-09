package com.javatechie.crud.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.crud.example.entity.Product;

public interface ProductRepository extends CrudRepository<Product,String> {
   List<Product> findByProdId(String name);
}

