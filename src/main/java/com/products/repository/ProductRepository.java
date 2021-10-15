package com.products.repository;

import com.products.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    //Product findByName(String product_name);
    List<Product> findByName(String name);
}