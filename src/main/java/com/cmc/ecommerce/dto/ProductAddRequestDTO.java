package com.cmc.ecommerce.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class ProductAddRequestDTO {
    private String displayName;
    private Double price;
    private String description;
    private MultipartFile[] images;
    private String[] categories;
}
