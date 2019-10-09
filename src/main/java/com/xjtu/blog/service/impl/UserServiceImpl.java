package com.xjtu.blog.service.impl;

import com.xjtu.blog.entity.User;
import com.xjtu.blog.repository.UserRepository;
import com.xjtu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Long userId) {
        return userRepository.findOne(userId);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findOneByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
