package com.wbg.springxmlbean.service.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleDataSourceServiceImplTest {

    @Test
    public void getRole() {
        RoleDataSourceServiceImpl roleDataSourceService=new RoleDataSourceServiceImpl();
        roleDataSourceService.getRole(1);
    }
}