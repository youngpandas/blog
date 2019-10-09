package com.xjtu.blog.repository;

import com.xjtu.blog.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogRepositoryTest {
    @Autowired
    private BlogRepository blogRepository;


    @Test
    public void findAllByUserId() {
        Page<Blog> blogPage = blogRepository.findAllByUserId(1L, new PageRequest(0, 20));
        System.out.println(blogPage.getTotalElements());
    }

    @Test
    public void findAllByCreateTimeAfter() {
        Date date = new Date(new Date(2019, 10, 4).getTime() / 1000);
        Pageable pageable = new PageRequest(0, 20);
        Page<Blog> blogPage = blogRepository.findAllByCreateTimeAfter(date, pageable);
        List<Blog> blogList = blogPage.getContent();
        for (Blog e : blogList) {
            System.out.println(e);
        }

    }

    @Test
    public void findAllByUserIdAfter() {
        Page<Blog> blogPage = blogRepository.findAllByUserIdAfter(100L, new PageRequest(0, 20));
        for (Blog e : blogPage.getContent()) {
            System.out.println(e);
        }
    }

    @Test
    public void findAllByCreateTimeAfterOrderByLikeNum() {
        Date date = new Date(2019, 10, 1);
        Pageable pageable = new PageRequest(0, 20);
        Page<Blog> blogPage = blogRepository.findAllByCreateTimeAfterOrderByLikeNum(date, pageable);
        List<Blog> blogList = blogPage.getContent();
        System.out.println(blogPage.getTotalElements());
        for (Blog e : blogList) {
            System.out.println(e);
        }
    }

    @Test
    public void findAll() {
        Sort sort = new Sort(Sort.Direction.DESC, "likeNum");
        List<Blog> blogPage = blogRepository.findAll(sort);
        System.out.println(blogPage.size());
        for (Blog e : blogPage.subList(0, 10)) {
            System.out.println(e);
        }
    }
}