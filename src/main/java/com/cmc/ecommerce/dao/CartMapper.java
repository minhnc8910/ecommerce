package com.cmc.ecommerce.dao;

import com.cmc.ecommerce.model.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cart row);

    Cart selectByPrimaryKey(Long id);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart row);
}