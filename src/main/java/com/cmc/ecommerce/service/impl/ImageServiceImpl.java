/**
 * @mbg.generated generator on Fri Aug 26 13:35:12 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.ImageMapper;
import com.cmc.ecommerce.model.Image;
import com.cmc.ecommerce.service.ImageService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    private final ImageMapper imageMapper;

    public ImageServiceImpl(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return imageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Image row) {
        return imageMapper.insert(row);
    }

    @Override
    public Image selectByPrimaryKey(Long id) {
        return imageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Image> selectAll() {
        return imageMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Image row) {
        return imageMapper.updateByPrimaryKey(row);
    }
}