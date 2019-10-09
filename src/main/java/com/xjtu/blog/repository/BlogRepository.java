package com.xjtu.blog.repository;

import com.xjtu.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    Page<Blog> findAllByUserId(Long userId, Pageable pageable);

    Page<Blog> findAllByUserIdAfter(Long userId, Pageable pageable);

    Page<Blog> findAllByCreateTimeAfterOrderByLikeNum(Date start, Pageable pageable);

    Page<Blog> findAllByCreateTimeAfter(Date start, Pageable pageable);

}
