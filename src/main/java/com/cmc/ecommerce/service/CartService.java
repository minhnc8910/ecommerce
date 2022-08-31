/**
 * @mbg.generated generator on Fri Aug 26 13:33:41 GMT+07:00 2022
 */
package com.cmc.ecommerce.service;

import com.cmc.ecommerce.model.Cart;

import java.util.List;

public interface CartService {
    int deleteByPrimaryKey(Long id);

    int insert(Cart row);

    Cart selectByPrimaryKey(Long id);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart row);
}