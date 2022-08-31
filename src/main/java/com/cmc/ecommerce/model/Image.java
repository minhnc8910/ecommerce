package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class Image {
    private Long id;

    private Long productId;

    private String url;

    private String desc;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}