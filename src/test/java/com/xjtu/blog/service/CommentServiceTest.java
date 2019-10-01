package com.xjtu.blog.service;

import com.xjtu.blog.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTest {

    @Autowired
    CommentService commentService;

    @Test
    public void save() {
        Comment comment = new Comment();
        comment.setBlogId(1L);
        comment.setContent("2999");
        commentService.save(comment);
    }

    @Test
    public void findAllByBlogId() {
    }
}