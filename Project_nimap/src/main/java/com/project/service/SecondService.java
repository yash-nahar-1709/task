package com.project.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.product;
import com.project.repository.SecondRepository;

@Service
public class SecondService {
    @Autowired
    private SecondRepository productRepository;

    public List<product> getAllProducts() {
        return productRepository.findAll();
    }

    public product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public product createProduct(product product) {
        return productRepository.save(product);
    }

    public product updateProduct(product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    public List<product> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<product> productPage = productRepository.findAll(pageable);
        return productPage.getContent();
    }

}

