package com.xjtu.blog.service.impl;

import com.xjtu.blog.entity.Comment;
import com.xjtu.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentService commentService;

    @Override
    public Comment save(Comment comment) {
        return commentService.save(comment);
    }

    @Override
    public Page<Comment> findAllByBlogId(Long blogId, Pageable pageable) {
        return commentService.findAllByBlogId(blogId, pageable);
    }
}
