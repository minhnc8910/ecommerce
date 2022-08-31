/**
 * @mbg.generated generator on Fri Aug 26 13:33:41 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.CartMapper;
import com.cmc.ecommerce.model.Cart;
import com.cmc.ecommerce.service.CartService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    private final CartMapper cartMapper;

    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cart row) {
        return cartMapper.insert(row);
    }

    @Override
    public Cart selectByPrimaryKey(Long id) {
        return cartMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Cart> selectAll() {
        return cartMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Cart row) {
        return cartMapper.updateByPrimaryKey(row);
    }
}