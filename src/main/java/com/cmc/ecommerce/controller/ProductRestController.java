package com.cmc.ecommerce.controller;

import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<?> getAll() {
        List<Product> products = this.productService.selectAll();
        return new ResponseEntity<>(products, products == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        Product product = this.productService.selectByPrimaryKey(id);
        return new ResponseEntity<>(product, product == null ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

//    @PostMapping("/product")
//    public ResponseEntity<?> insertOrUpdate(@Valid @RequestBody ReqProductDto dto) {
//        int row = this.productService.insertOrUpdate(dto);
//        return new ResponseEntity<>(row != 0 ? "Update Successfully" : "Update Fail", row != 0 ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
//    }
//
//    @GetMapping("/product/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable("id") Long id){
//        int row = this.productService.deleteByPrimaryKey(id);
//        return new ResponseEntity<>(row != 0 ? "Delete Successfully" : "Delete Fail", row != 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
//    }
//
//    @GetMapping("/product/search")
//    public ResponseEntity<?> search(@RequestBody ReqSearchProductDto dto){
//        List<RespProductDto> respProductDtos = this.productService.search(dto);
//        return new ResponseEntity<>(respProductDtos, respProductDtos != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
//    }
}
