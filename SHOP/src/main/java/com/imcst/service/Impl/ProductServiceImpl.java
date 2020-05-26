package com.imcst.service.Impl;

import com.imcst.dao.IProductDao;
import com.imcst.domain.Orders;
import com.imcst.domain.Product;
import com.imcst.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }

    @Override
    public Product edit(String productId) throws Exception {
        return productDao.edit(productId);
    }

    @Override
    public Product findById(String productId) throws Exception{
        return productDao.findById(productId);
    }

    @Override
    public void updateById(Product product) throws Exception {
        productDao.updateById(product);
    }

}
