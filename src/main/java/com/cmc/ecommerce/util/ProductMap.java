package com.cmc.ecommerce.util;


import com.cmc.ecommerce.dto.ProductDTOUSER;
import com.cmc.ecommerce.dto.ProductMapper;
import com.cmc.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMap {
    public static Product dtoMapProduct(ProductDTOUSER dtouser){



        Product product = new Product();
        product.setName(dtouser.getName());
        product.setDesc(dtouser.getDesc());
        product.setPrice(dtouser.getPrice());
        return product;
    }

    public static ProductMapper dtoMapProduct(Product item){
            return new ProductMapper(item.getId(), item.getName(),item.getPrice() , item.getDesc(), ImageMap.MapImage( item.getListImg()),
                    CategoryMap.MapImage(item.getListCategory()));
    }

    public static List<ProductMapper> dtoMapProduct(List<Product> list){
        List<ProductMapper> listDTO = new ArrayList<>();
        for (Product item:list
             ) {
            ProductMapper itemDTO = new ProductMapper(item.getId(), item.getName(),item.getPrice() , item.getDesc(), ImageMap.MapImage( item.getListImg()),
                    CategoryMap.MapImage(item.getListCategory()));
            listDTO.add(itemDTO);
        }
        return listDTO;
    }
}
