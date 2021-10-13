package com.products.service;

import com.products.entity.Product;
import com.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@Component
public class ProductService {
    @Autowired
    ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int product_id) {
        return repository.findById(product_id).orElse(null);
    }

    /*public List<Product> getProductByName(String product_name) {
        return repository.findByName(product_name);
    }*/

    public String deleteProduct(int product_id) {
        repository.deleteById(product_id);
        return "product removed !! " + product_id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getProduct_id()).orElse(null);
        existingProduct.setProduct_name(product.getProduct_name());
        existingProduct.setProduct_price(product.getProduct_price());
        existingProduct.setProduct_rating(product.getProduct_rating());
        return repository.save(existingProduct);
    }


}
