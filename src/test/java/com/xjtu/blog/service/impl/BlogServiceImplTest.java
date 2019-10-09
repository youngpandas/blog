package com.xjtu.blog.service.impl;

import com.xjtu.blog.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceImplTest {
    @Autowired
    private BlogService blogService;

    @Test
    public void save() {
    }

    @Test
    public void findAllByUserId() {
    }

    @Test
    public void getHotBlog() {
        System.out.println(blogService.getHotBlog());
    }

    @Test
    public void getNewBlog() {
        System.out.println(blogService.getNewBlog());
    }
}