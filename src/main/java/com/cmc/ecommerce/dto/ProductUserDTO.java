package com.cmc.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductUserDTO {
    private long id;
    private String displayName;
    private Double price;
    private String description;
    private List<ImageMapper> images;
    private List<CategoryMapper> categories;

}
