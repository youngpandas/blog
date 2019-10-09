package com.xjtu.blog;


import com.xjtu.blog.entity.Blog;
import com.xjtu.blog.entity.Comment;
import com.xjtu.blog.entity.User;
import com.xjtu.blog.service.BlogService;
import com.xjtu.blog.service.CommentService;
import com.xjtu.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataCreator {

    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @Autowired
    private CommentService commentService;


    @Test
    public void creatData() {
        Set<String> nameSet = new HashSet<>();
        while (nameSet.size() < 500) {
            StringBuilder name = new StringBuilder();
            int len = (int) (7 + Math.random() * 8);
            for (int i = 0; i < len; i++) {
                name.append((char) ((int) (Math.random() * 26) + 'a'));
            }
            nameSet.add(name.toString());
        }
        List<String> nameList = new ArrayList<>(nameSet);

        List<User> userList = new ArrayList<>();
        for (String name : nameList) {
            User user = new User();
            user.setIcon("#");
            user.setPassword("123456");
            user.setUsername(name);
            User back = userService.save(user);
            userList.add(back);
        }

        List<Blog> blogList = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            System.out.println((i+1)+" / "+ 5000);
            int index = (int) (Math.random() * userList.size());
            User user = userList.get(index);
            Blog blog = new Blog();
            blog.setContent("假装这里有内容，但其实没有。");
            blog.setLikeNum((long) (Math.random() * 1000) + 20);
            blog.setTitle("模拟内容，标题，主要用于测试可以忽略，哈哈哈哈哈哈");
            blog.setUserId(user.getNid());
            Blog back = blogService.save(blog);
            blogList.add(back);
        }

        for (int i = 0; i < 100000; i++) {
            System.out.println((i+1)+" / "+ 100000);
            int index = (int) (Math.random() * blogList.size());
            Blog blog = blogList.get(index);
            Comment comment = new Comment();
            comment.setBlogId(blog.getNid());
            comment.setContent("我是键盘侠，打我啊");
            commentService.save(comment);
        }

    }

}
