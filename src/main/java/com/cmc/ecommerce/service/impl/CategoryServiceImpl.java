/**
 * @mbg.generated generator on Fri Aug 26 13:34:44 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.CategoryMapper;
import com.cmc.ecommerce.model.Category;
import com.cmc.ecommerce.service.CategoryService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Category row) {
        return categoryMapper.insert(row);
    }

    @Override
    public Category selectByPrimaryKey(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Category> selectAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Category row) {
        return categoryMapper.updateByPrimaryKey(row);
    }
}