/**
 * @mbg.generated generator on Fri Aug 26 13:35:39 GMT+07:00 2022
 */
package com.cmc.ecommerce.service.impl;

import com.cmc.ecommerce.dao.RoleMapper;
import com.cmc.ecommerce.model.Role;
import com.cmc.ecommerce.service.RoleService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @Override
    public int deleteByPrimaryKey(Byte id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role row) {
        return roleMapper.insert(row);
    }

    @Override
    public Role selectByPrimaryKey(Byte id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Role row) {
        return roleMapper.updateByPrimaryKey(row);
    }
}