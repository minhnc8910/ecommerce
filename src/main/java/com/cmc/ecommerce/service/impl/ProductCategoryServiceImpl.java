/**
 * @mbg.generated generator on Fri Aug 26 13:35:33 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.ProductCategoryMapper;
import com.cmc.ecommerce.model.ProductCategory;
import com.cmc.ecommerce.service.ProductCategoryService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    private final ProductCategoryMapper productCategoryMapper;

    public ProductCategoryServiceImpl(ProductCategoryMapper productCategoryMapper) {
        this.productCategoryMapper = productCategoryMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long categoryId, Long productId) {
        return productCategoryMapper.deleteByPrimaryKey(categoryId, productId);
    }

    @Override
    public int insert(ProductCategory row) {
        return productCategoryMapper.insert(row);
    }

    @Override
    public ProductCategory selectByPrimaryKey(Long categoryId, Long productId) {
        return productCategoryMapper.selectByPrimaryKey(categoryId, productId);
    }

    @Override
    public List<ProductCategory> selectAll() {
        return productCategoryMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(ProductCategory row) {
        return productCategoryMapper.updateByPrimaryKey(row);
    }
}