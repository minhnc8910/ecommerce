/**
 * @mbg.generated generator on Fri Aug 26 13:35:51 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.UserMapper;
import com.cmc.ecommerce.model.User;
import com.cmc.ecommerce.service.UserService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User row) {
        return userMapper.insert(row);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(User row) {
        return userMapper.updateByPrimaryKey(row);
    }
}