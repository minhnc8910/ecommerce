package com.cmc.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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