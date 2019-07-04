package com.codegym.cms.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceService implements ProvinceService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public void save(Product province) {
        productRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        productRepository.delete(id);
    }
}