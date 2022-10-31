package com.nguyenhung.controllers;

import com.nguyenhung.entity.Product;
import com.nguyenhung.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;


    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepo.save(product);
    }


    @GetMapping
    public List<Object> getAllProduct() {
        return productRepo.findAll();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id) {
        return productRepo.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productRepo.deleteProduct(id);
    }
}
