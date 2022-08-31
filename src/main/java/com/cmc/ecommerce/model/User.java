package com.cmc.ecommerce.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.cmc.ecommerce.dao.RoleMapper;
import com.cmc.ecommerce.service.RoleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
public class User implements UserDetails {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Byte deleteYn;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;

    private Byte roleId;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println(this.toString());
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        if (this.roleId == 1) {
            authorities.add(new SimpleGrantedAuthority("ADMIN"));
        }else {
            authorities.add(new SimpleGrantedAuthority("USER"));
        }
        return authorities;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}