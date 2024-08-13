package com.micro.with.jdbc.example.MicroserviceDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.micro.with.jdbc.example.MicroserviceDemo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
