package com.imcst.service;

import com.imcst.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;

    Product edit(String productId) throws Exception;

    Product findById(String productId) throws Exception;

    void updateById(Product product) throws Exception;
}
