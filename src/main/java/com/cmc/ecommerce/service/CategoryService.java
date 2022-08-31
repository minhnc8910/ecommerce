/**
 * @mbg.generated generator on Tue Aug 30 10:47:31 GMT+07:00 2022
 */
package com.cmc.ecommerce.service;


import com.cmc.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    int deleteByPrimaryKey(Long id);

    int insert(Category row);

    Category selectByPrimaryKey(Long id);

    List<Category> selectAll();

    int updateByPrimaryKey(Category row);
}