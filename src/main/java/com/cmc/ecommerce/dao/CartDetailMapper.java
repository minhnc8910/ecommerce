package com.cmc.ecommerce.dao;

import com.cmc.ecommerce.model.CartDetail;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CartDetailMapper {
    int deleteByPrimaryKey(@Param("cartId") Long cartId, @Param("productId") Long productId);

    int insert(CartDetail row);

    CartDetail selectByPrimaryKey(@Param("cartId") Long cartId, @Param("productId") Long productId);

    List<CartDetail> selectAll();

    int updateByPrimaryKey(CartDetail row);
}