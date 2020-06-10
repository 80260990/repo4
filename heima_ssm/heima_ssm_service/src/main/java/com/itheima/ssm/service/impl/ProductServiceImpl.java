package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname ProductServiceImpl
 * @Description TODO
 * @Date 2020/5/16 21:34
 * @Created by Leslie
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void saveProduct(Product product) throws Exception {
        productDao.saveProduct(product);
    }

    @Override
    public void deleteById(Integer productId) throws Exception {
        productDao.deleteById(productId);
    }

    @Override
    public Product findById(Integer productId) throws Exception {
        return productDao.findById(productId);
    }

    @Override
    public void updateById(Product product) throws Exception {
        productDao.updateById(product);
    }
}
