package com.cmc.ecommerce.util;

import com.cmc.ecommerce.dao.UserMapper;
import com.cmc.ecommerce.dto.ImageMapper;
import com.cmc.ecommerce.dto.ProductAdminDTO;
import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductAdminMap {
        @Autowired
        public  UserMapper userMapper;
    public  List<ProductAdminDTO> dtoMapProduct(List<Product> list){
        List<ProductAdminDTO> listDTO = new ArrayList<>();
        for (Product item:list
        ) {
            User creator = new User();
            User modifier = new User();
            if(item.getCreatedId()!= null) {
                 creator = userMapper.selectByPrimaryKey(item.getCreatedId());
            }
            if(item.getUpdatedId()!= null) {
                 modifier = userMapper.selectByPrimaryKey(item.getUpdatedId());
            }
            ProductAdminDTO itemDTO = new ProductAdminDTO(item.getId(), item.getName(), item.getPrice(), item.getDesc(),ImageMap.MapImage( item.getListImg()), CategoryMap.MapImage(item.getListCategory()),
                    item.getDeleteYn(),UserMap.mapUser(creator), item.getCreatedDtm(),UserMap.mapUser(modifier), item.getUpdatedDtm());
            listDTO.add(itemDTO);
        }
        return listDTO;
    }


    public  ProductAdminDTO dtoMapProduct(Product product){
        ProductAdminDTO dTO = new ProductAdminDTO();

            User creator = new User();
            User modifier = new User();
            if(product.getCreatedId()!= null) {
                creator = userMapper.selectByPrimaryKey(product.getCreatedId());
            }
            if(product.getUpdatedId()!= null) {
                modifier = userMapper.selectByPrimaryKey(product.getUpdatedId());
            }
            dTO = new ProductAdminDTO(product.getId(), product.getName(), product.getPrice(), product.getDesc(),
                    ImageMap.MapImage( product.getListImg()), CategoryMap.MapImage(product.getListCategory()),
                    product.getDeleteYn(),UserMap.mapUser(creator), product.getCreatedDtm(),UserMap.mapUser(modifier), product.getUpdatedDtm());
        return dTO;
    }
}
