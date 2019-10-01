package com.xjtu.blog.service.impl;

import com.xjtu.blog.entity.User;
import com.xjtu.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setUsername("hahaaha");
        user.setPassword("123456");
        user.setIcon("#");
        userService.save(user);
        System.out.println(user);
    }

    @Test
    public void findOneByUsername() {
        User user = userService.findOneByUsername("hahaaha");
        System.out.println(user);
    }
}