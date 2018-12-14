package com.wbg.springxmlbean.controller;

import com.wbg.springxmlbean.entity.Role;
import com.wbg.springxmlbean.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.ws.rs.QueryParam;

@Component
public class RoleController {

    @Autowired
    @Qualifier("roleService2")
    private RoleService roleService=null;

    public void printRole(){
        System.out.println("进入了");
        roleService.printRoleInfo();
    }

    public static void main(String[] args) {

    }


}
