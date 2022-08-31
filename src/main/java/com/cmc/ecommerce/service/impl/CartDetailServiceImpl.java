/**
 * @mbg.generated generator on Fri Aug 26 13:33:47 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.CartDetailMapper;
import com.cmc.ecommerce.model.CartDetail;
import com.cmc.ecommerce.service.CartDetailService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CartDetailServiceImpl implements CartDetailService {
    private final CartDetailMapper cartDetailMapper;

    public CartDetailServiceImpl(CartDetailMapper cartDetailMapper) {
        this.cartDetailMapper = cartDetailMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long cartId, Long productId) {
        return cartDetailMapper.deleteByPrimaryKey(cartId, productId);
    }

    @Override
    public int insert(CartDetail row) {
        return cartDetailMapper.insert(row);
    }

    @Override
    public CartDetail selectByPrimaryKey(Long cartId, Long productId) {
        return cartDetailMapper.selectByPrimaryKey(cartId, productId);
    }

    @Override
    public List<CartDetail> selectAll() {
        return cartDetailMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(CartDetail row) {
        return cartDetailMapper.updateByPrimaryKey(row);
    }
}