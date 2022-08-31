/**
 * @mbg.generated generator on Fri Aug 26 13:35:25 GMT+07:00 2022
 */
package com.cmc.ecommerce.service;

import com.cmc.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    int deleteByPrimaryKey(Long id);

    int insert(Product row);

    Product selectByPrimaryKey(Long id);

    List<Product> selectAll();

    int updateByPrimaryKey(Product row);
}