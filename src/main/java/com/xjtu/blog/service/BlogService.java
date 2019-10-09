package com.xjtu.blog.service;

import com.xjtu.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;


public interface BlogService {

    Blog save(Blog blog);

    Page<Blog> findAllByUserId(Long userId, Pageable pageable);

    List<Blog> getHotBlog();

    List<Blog> getNewBlog();

}
