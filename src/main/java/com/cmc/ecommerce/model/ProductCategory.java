package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class ProductCategory {
    private Long categoryId;

    private Long productId;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}