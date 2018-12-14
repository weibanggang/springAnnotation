package com.wbg.springxmlbean.controller;

import com.wbg.springxmlbean.entity.*;
import com.wbg.springxmlbean.service.RoleDataSourceService;
import com.wbg.springxmlbean.service.RoleService;
import com.wbg.springxmlbean.service.UserService;
import com.wbg.springxmlbean.service.impl.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {

        getRole();
        //getUser();
    }
    private static void getUser(){
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User user=context.getBean(User.class);
        UserService userService=context.getBean(UserService.class);
        userService.setUser(user);
    }
    private static void getRole(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Role12.xml");
        RoleDataSourceService roleDataSourceService=context.getBean(RoleDataSourceService.class);
        System.out.println(roleDataSourceService.getRole(1));
    }
}
