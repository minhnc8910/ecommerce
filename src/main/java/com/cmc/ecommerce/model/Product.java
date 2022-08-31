package com.cmc.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    private List<Image> listImg;

    private List<Category> listCategory;


}