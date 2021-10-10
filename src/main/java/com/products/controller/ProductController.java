package com.products.controller;

import com.products.entity.Product;
import com.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@Valid @RequestBody Product product) {
        return service.saveProduct(product);
    }

    /*@RequestMapping(value="/api/v1/products", method = RequestMethod.POST)
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }*/

    //@RequestMapping(value="/api/v1/products", method = RequestMethod.GET)
    @GetMapping
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    /*@GetMapping("/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }*/

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
