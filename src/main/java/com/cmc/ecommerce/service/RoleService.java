/**
 * @mbg.generated generator on Fri Aug 26 13:35:39 GMT+07:00 2022
 */
package com.cmc.ecommerce.service;

import com.cmc.ecommerce.model.Role;

import java.util.List;

public interface RoleService {
    int deleteByPrimaryKey(Byte id);

    int insert(Role row);

    Role selectByPrimaryKey(Byte id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role row);
}