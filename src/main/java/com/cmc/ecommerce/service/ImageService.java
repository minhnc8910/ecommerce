/**
 * @mbg.generated generator on Fri Aug 26 13:35:12 GMT+07:00 2022
 */
package com.cmc.ecommerce.service;

import com.cmc.ecommerce.model.Image;

import java.util.List;

public interface ImageService {
    int deleteByPrimaryKey(Long id);

    int insert(Image row);

    Image selectByPrimaryKey(Long id);

    List<Image> selectAll();

    int updateByPrimaryKey(Image row);
}