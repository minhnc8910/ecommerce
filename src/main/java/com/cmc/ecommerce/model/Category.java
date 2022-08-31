package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class Category {
    private Long id;

    private String name;

    private String url;

    private String desc;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}