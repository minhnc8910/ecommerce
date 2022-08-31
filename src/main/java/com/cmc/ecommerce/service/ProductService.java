/**
* @mbg.generated
* generator on Mon Aug 29 08:55:05 GMT+07:00 2022
*/
package com.cmc.ecommerce.service;

import com.cmc.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    int deleteByPrimaryKey(Long id);

    int insert(Product row);

    Product selectByPrimaryKey(Long id);

    List<Product> selectAll(int current_page, int page_size);

    int updateByPrimaryKey(Product row);

    List<Product> search(String name, int current_page, int page_size);
}