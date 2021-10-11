package com.products.controller;
import javax.validation.Valid;
import com.products.entity.Product;
import com.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
//@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping(value="/api/v1/products", method = RequestMethod.POST)
    public Product addProduct(@RequestBody @Valid Product product) {
        return service.saveProduct(product);
    }

    /*@RequestMapping(value="/api/v1/products", method = RequestMethod.POST)
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }*/

    @RequestMapping(value="/api/v1/products", method = RequestMethod.GET)
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @RequestMapping(value="/api/v1/products/{id}", method = RequestMethod.GET)
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @RequestMapping(value="/api/v1/products/{name}", method = RequestMethod.GET)
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @RequestMapping(value="/api/v1/products",method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @RequestMapping(value="/api/v1/products/{id}", method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
