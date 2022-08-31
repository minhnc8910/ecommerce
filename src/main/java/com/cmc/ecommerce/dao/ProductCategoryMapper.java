package com.cmc.ecommerce.dao;

import com.cmc.ecommerce.model.ProductCategory;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductCategoryMapper {
    int deleteByPrimaryKey(@Param("categoryId") Long categoryId, @Param("productId") Long productId);

    int insert(ProductCategory row);

    ProductCategory selectByPrimaryKey(@Param("categoryId") Long categoryId, @Param("productId") Long productId);

    List<ProductCategory> selectAll();

    int updateByPrimaryKey(ProductCategory row);
}