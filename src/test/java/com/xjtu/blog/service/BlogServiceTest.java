package com.xjtu.blog.service;

import com.xjtu.blog.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceTest {

    @Autowired
    BlogService blogService;

    @Test
    public void save() {
        Blog blog = new Blog();
        blog.setContent("一派胡言！");
        blog.setTitle("中国威胁论");
        blog.setUserId(1L);
        blog.setLikeNum(2L);
        blogService.save(blog);
        System.out.println(blog);
    }

    @Test
    public void findAllByUserId() {
        Pageable pageable = new PageRequest(0, 20); // 从0开始
        Page<Blog> blogs = blogService.findAllByUserId(1L, pageable);
        System.out.println(blogs.getContent());
        System.out.println(blogs.getTotalPages());
        System.out.println(blogs.getTotalElements());
    }
}