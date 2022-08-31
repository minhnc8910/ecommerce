package com.cmc.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductMapper {
    private long id;
    private String name;
    private Double price;
    private String desc;
    private List<ImageMapper> imgUrl;
    private List<CategoryMapper> imgCtg;

}
