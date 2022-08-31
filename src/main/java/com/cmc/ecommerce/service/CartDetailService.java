/**
 * @mbg.generated generator on Fri Aug 26 13:33:47 GMT+07:00 2022
 */
package com.cmc.ecommerce.service;

import com.cmc.ecommerce.model.CartDetail;

import java.util.List;

public interface CartDetailService {
    int deleteByPrimaryKey(Long cartId, Long productId);

    int insert(CartDetail row);

    CartDetail selectByPrimaryKey(Long cartId, Long productId);

    List<CartDetail> selectAll();

    int updateByPrimaryKey(CartDetail row);
}