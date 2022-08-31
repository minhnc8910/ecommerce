package com.cmc.ecommerce.controller;

import com.cmc.ecommerce.dto.ProductMapper;
import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.service.ProductService;
import com.cmc.ecommerce.util.ProductMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api")
public class ProductRestController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "getAllProductsUser/{currentPage}/{pageSize}")
    public ResponseEntity getAllProductsUser(@PathVariable("currentPage") int currentPage, @PathVariable("pageSize") int pageSize){
        List<Product> listProduct = new ArrayList<>();

        List<ProductMapper> listDTO = new ArrayList<>();
        listProduct = productService.selectAll(currentPage,pageSize);
        listDTO = ProductMap.dtoMapProduct(listProduct);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

    @GetMapping(value = "getDetailProduct/{id}")
    public ResponseEntity getDetailProductUser(@PathVariable("id") Long id){
        Product prd = productService.selectByPrimaryKey(id);
        ProductMapper prdDTO = ProductMap.dtoMapProduct(prd);
        return new ResponseEntity<>(prdDTO,prdDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);

    }

    @GetMapping(value = "search/{currentPage}/{pageSize}")
    public ResponseEntity searchProductUser(@RequestBody ProductMapper dto , @PathVariable("currentPage") int currentPage, @PathVariable("pageSize") int pageSize){
        List<Product> list  = new ArrayList<>();
        list = productService.search(dto.getName(),currentPage,pageSize);

        List<ProductMapper> listDTO = ProductMap.dtoMapProduct(list);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

}
