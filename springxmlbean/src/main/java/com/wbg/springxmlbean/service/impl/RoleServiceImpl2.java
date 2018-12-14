package com.wbg.springxmlbean.service.impl;

import com.wbg.springxmlbean.entity.Role;
import com.wbg.springxmlbean.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("roleService2")
public class RoleServiceImpl2 implements RoleService {

    @Autowired
    private Role role;
    @Override
    public void printRoleInfo() {
        System.out.println("进入了RoleServiceImpl22");
        System.out.println(role);
    }
}
