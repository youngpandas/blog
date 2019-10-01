package com.xjtu.blog.service.impl;

import com.xjtu.blog.entity.Blog;
import com.xjtu.blog.repository.BlogRepository;
import com.xjtu.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Page<Blog> findAllByUserId(Long userId, Pageable pageable) {
        return blogRepository.findAllByUserId(userId, pageable);
    }
}
