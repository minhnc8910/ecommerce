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

    @GetMapping(value = "products")
    public ResponseEntity getAllProductsUser(@RequestParam(value = "page") int currentPage,
                                             @RequestParam(value = "size") int pageSize){
        List<Product> listProduct = new ArrayList<>();

        List<ProductMapper> listDTO = new ArrayList<>();
        listProduct = productService.selectAll(currentPage,pageSize);
        listDTO = ProductMap.dtoMapProduct(listProduct);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

    @GetMapping(value = "products/{id}")
    public ResponseEntity getDetailProductUser(@PathVariable("id") Long id){
        Product prd = productService.selectByPrimaryKey(id);
        ProductMapper prdDTO = ProductMap.dtoMapProduct(prd);
        return new ResponseEntity<>(prdDTO,prdDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);

    }

    @GetMapping(value = "search")
    public ResponseEntity searchProductUser(@RequestParam(value = "name") String name ,
                                            @RequestParam(value = "page") int currentPage,
                                            @RequestParam(value = "size") int pageSize){
        List<Product> list  = new ArrayList<>();
        list = productService.search(name,currentPage,pageSize);

        List<ProductMapper> listDTO = ProductMap.dtoMapProduct(list);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

}
