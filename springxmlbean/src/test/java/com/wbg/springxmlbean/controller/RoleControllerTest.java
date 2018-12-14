package com.wbg.springxmlbean.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleControllerTest {

    @Test
    public void printRole() {
        RoleController roleController=new RoleController();
        roleController.printRole();
    }
}