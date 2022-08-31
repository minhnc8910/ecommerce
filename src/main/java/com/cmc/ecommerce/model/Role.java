package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class Role {
    private Byte id;

    private String name;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;
}