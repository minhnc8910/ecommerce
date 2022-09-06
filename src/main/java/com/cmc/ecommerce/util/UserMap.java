package com.cmc.ecommerce.util;

import com.cmc.ecommerce.dto.UserDTO;
import com.cmc.ecommerce.model.User;

public class UserMap {


    public static UserDTO mapUser(User user){
        if(user.getId() != null) {
            UserDTO dto = new UserDTO(user.getId(), user.getName(), user.getEmail());
            return dto;
        }
        else
            return new UserDTO();
    }
}
