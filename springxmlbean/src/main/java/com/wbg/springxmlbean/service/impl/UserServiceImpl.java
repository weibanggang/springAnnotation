package com.wbg.springxmlbean.service.impl;

import com.wbg.springxmlbean.entity.User;
import com.wbg.springxmlbean.service.UserService;
import org.springframework.stereotype.Component;

/**
 * 这里的@Component 表名它是一个Spring所需要的 Bean
 * 而且也实现了对于的UserService接口所定义的方法getUser、setUser
 */
@Component
public class UserServiceImpl implements UserService {

    private User user;
    @Override
    public User getUser() {
        return user;
    }
    @Override
    public void setUser(User user){
        System.out.println("进入了UserServiceImpl.setUser");
        System.out.println(user);
    }
}
