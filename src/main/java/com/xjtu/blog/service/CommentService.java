package com.xjtu.blog.service;

import com.xjtu.blog.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentService {

    Comment save(Comment comment);

    Page<Comment> findAllByBlogId(Long blogId, Pageable pageable);

}
