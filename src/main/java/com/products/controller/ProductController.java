package com.products.controller;

import com.products.entity.Product;
import com.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public Product addProduct(@Valid @RequestBody Product product) {

        return service.saveProduct(product);
    }


    @GetMapping
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/{product_id}")
    public Product findProductById(@PathVariable int product_id) {
        return service.getProductById(product_id);
    }

    /*@GetMapping("/{product_name}")
    public List<Product> findProductByName(@PathVariable String product_name) {
        return service.getProductByName(product_name);
    }*/

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/{product_id}")
    public String deleteProduct(@PathVariable int product_id) {
        return service.deleteProduct(product_id);
    }
}
