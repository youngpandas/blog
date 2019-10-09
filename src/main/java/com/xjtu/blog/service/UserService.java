package com.xjtu.blog.service;

import com.xjtu.blog.entity.User;

public interface UserService {

    User findOne(Long userId);

    User save(User user);

    User findOneByUsername(String username);

}
