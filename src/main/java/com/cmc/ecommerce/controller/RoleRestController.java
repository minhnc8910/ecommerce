package com.cmc.ecommerce.controller;

import com.cmc.ecommerce.model.Product;
import com.cmc.ecommerce.model.Role;
import com.cmc.ecommerce.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleRestController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public ResponseEntity<?> getAll() {
        List<Role> roles = this.roleService.selectAll();
        return new ResponseEntity<>(roles, roles == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

}
