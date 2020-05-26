package com.imcst.service.Impl;

import com.github.pagehelper.PageHelper;
import com.imcst.dao.IOrderDao;
import com.imcst.domain.Orders;
import com.imcst.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrderServiceImpl implements IOrderService{
    @Autowired
    private IOrderDao orderDao;
    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
        //pagenum页码值   pagesize每页显示条数
        PageHelper.startPage(page,size);
        return orderDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return orderDao.findById(ordersId);
    }

}
