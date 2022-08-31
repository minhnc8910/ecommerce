/**
 * @mbg.generated generator on Fri Aug 26 13:35:25 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.ProductMapper;
import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.service.ProductService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Product row) {
        return productMapper.insert(row);
    }

    @Override
    public Product selectByPrimaryKey(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> selectAll() {
        return productMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Product row) {
        return productMapper.updateByPrimaryKey(row);
    }
}