package com.cmc.ecommerce.dao;

import com.cmc.ecommerce.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User row);

    User selectByPrimaryKey(Long id);

    User selectByEmail(String email);

    List<User> selectAll();

    int updateByPrimaryKey(User row);
}