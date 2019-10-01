package com.xjtu.blog.repository;

import com.xjtu.blog.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() {
        User user = new User();
        user.setIcon("#");
        user.setPassword("123456");
        user.setUsername("youngpanda1");
        User back = userRepository.save(user);
        System.out.println(back);
        System.out.println(user);
    }

    @Test
    public void findByUsername() {
        User user = userRepository.findByUsername("youngpanda1");
        System.out.println(user);
    }
}