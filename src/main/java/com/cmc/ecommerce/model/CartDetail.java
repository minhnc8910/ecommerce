package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class CartDetail {
    private Long cartId;

    private Long productId;

    private Integer quantity;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}