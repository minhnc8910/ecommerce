/**
* @mbg.generated
* generator on Mon Aug 29 08:55:05 GMT+07:00 2022
*/
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.ProductMapper;
import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper=productMapper;
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
    public List<Product> selectAll(int current_page, int page_size) {

        int offset = (current_page-1)* page_size;
        page_size = offset+page_size;
        return productMapper.selectAll(offset,page_size);
    }

    @Override
    public int updateByPrimaryKey(Product row) {
        return productMapper.updateByPrimaryKey(row);
    }

    @Override
    public List<Product> search(String name, int current_page, int page_size) {
        int offset = (current_page-1)* page_size;
        page_size = offset+page_size;
        return productMapper.search(name, offset,page_size);

    }
}