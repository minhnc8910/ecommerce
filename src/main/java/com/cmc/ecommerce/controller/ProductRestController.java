package com.cmc.ecommerce.controller;

import com.cmc.ecommerce.dto.ProductAdminDTO;
import com.cmc.ecommerce.dto.ProductUserDTO;
import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.service.ProductService;
import com.cmc.ecommerce.util.FileUtils;
import com.cmc.ecommerce.util.ProductAdminMap;
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

    ProductAdminMap adminMap = new ProductAdminMap();
    @Autowired
    ProductService productService;

    FileUtils fileUtils = new FileUtils();

    @GetMapping(value = "products")
    public ResponseEntity getAllProductsUser(@RequestParam(value = "page") int currentPage,
                                             @RequestParam(value = "size") int pageSize){
        List<Product> listProduct = new ArrayList<>();

        List<ProductUserDTO> listDTO = new ArrayList<>();
        listProduct = productService.selectAll(currentPage,pageSize);
        listDTO = ProductMap.dtoMapProduct(listProduct);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

    @GetMapping(value = "productsAdmin")
    public ResponseEntity getAllProductsAdmin(@RequestParam(value = "page") int currentPage,
                                              @RequestParam(value = "size") int pageSize){
        List<Product> listProduct = new ArrayList<>();

        List<ProductAdminDTO> listDTO = new ArrayList<>();
        listProduct = productService.selectAll(currentPage,pageSize);
        listDTO = adminMap.dtoMapProduct(listProduct);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

    @GetMapping(value = "products/{id}")
    public ResponseEntity getDetailProductUser(@PathVariable("id") Long id){
        Product prd = productService.selectByPrimaryKey(id);
        ProductUserDTO prdDTO = ProductMap.dtoMapProduct(prd);
        return new ResponseEntity<>(prdDTO,prdDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);

    }
    @GetMapping(value = "productsAdmin/{id}")
    public ResponseEntity getDetailProductAdmin(@PathVariable("id") Long id){
        Product prd = productService.selectByPrimaryKey(id);
        ProductAdminDTO prdDTO = adminMap.dtoMapProduct(prd);
        return new ResponseEntity<>(prdDTO,prdDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);

    }

    @GetMapping(value = "search")
    public ResponseEntity searchProductUser(@RequestParam(value = "name") String name ,
                                            @RequestParam(value = "page") int currentPage,
                                            @RequestParam(value = "size") int pageSize){
        List<Product> list  = new ArrayList<>();
        list = productService.search(name,currentPage,pageSize);

        List<ProductUserDTO> listDTO = ProductMap.dtoMapProduct(list);

        return new ResponseEntity<>(listDTO,listDTO==null? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

//    @PostMapping(value = "addProduct")
//    public ResponseEntity addProduct(@RequestParam("files") MultipartFile[] multipartFile){
//        try {
//            for(MultipartFile file: multipartFile){
//                fileUtils.saveFile(file);
//            }
//            return  new ResponseEntity<>(HttpStatus.OK);
//        }
//
//        catch (Exception e){
//            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//
//        }
//
//    }
}
