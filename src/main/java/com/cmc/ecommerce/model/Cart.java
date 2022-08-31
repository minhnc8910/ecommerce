package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class Cart {
    private Long id;

    private Long userId;

    private String url;

    private String desc;

    private Byte deleteYn;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}