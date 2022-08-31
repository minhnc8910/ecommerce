package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class Product {
    private Long id;

    private String name;

    private Double price;

    private String desc;

    private Byte deleteYn;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}