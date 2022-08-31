package com.cmc.ecommerce.util;

import com.cmc.ecommerce.dto.ImageMapper;
import com.cmc.ecommerce.model.Image;

import java.util.ArrayList;
import java.util.List;

public class ImageMap {
    public static List<ImageMapper>  MapImage(List<Image> img){
        List<ImageMapper> listDTO = new ArrayList<>();
        for (Image item:img
             ) {
            listDTO.add(new ImageMapper(item.getId(), item.getUrl()));

        }
        return listDTO;
    }
}
