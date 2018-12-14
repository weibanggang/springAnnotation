package com.wbg.springxmlbean.service.impl;

import com.wbg.springxmlbean.entity.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleServiceImplTest {

    @Test
    public void printRoleInfo() {
        RoleServiceImpl roleService=new RoleServiceImpl();
        roleService.printRoleInfo();
    }

}