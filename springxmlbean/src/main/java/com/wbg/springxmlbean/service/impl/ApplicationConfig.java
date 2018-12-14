package com.wbg.springxmlbean.service.impl;

import com.wbg.springxmlbean.entity.User;
import org.springframework.context.annotation.ComponentScan;

/**
 * basePackageClasses直接扫描指定类
 */
@ComponentScan(basePackageClasses = {User.class,UserServiceImpl.class})
/**
 * basePackages可读性好，但不建议使用，因为修改包名没有提示
 */
//@ComponentScan(basePackages = {"com.wbg.springxmlbean.entity","com.wbg.springxmlbean.service"})

public class ApplicationConfig {
}
