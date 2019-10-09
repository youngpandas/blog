package com.xjtu.blog.controller;

import com.xjtu.blog.DTO.BlogDTO;
import com.xjtu.blog.entity.Blog;
import com.xjtu.blog.service.BlogService;
import com.xjtu.blog.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private UserService userService;

    @RequestMapping("")
    String index(Model model) {
        List<Blog> blogHotTop = blogService.getHotBlog();
        List<Blog> blogNewTop = blogService.getNewBlog();

        List<BlogDTO> blogDTOHotTop = new ArrayList<>();
        for (Blog e : blogHotTop) {
            BlogDTO temp = new BlogDTO();
            BeanUtils.copyProperties(e, temp);
            temp.setUsername(userService.findOne(e.getUserId()).getUsername());
            blogDTOHotTop.add(temp);
        }
        List<BlogDTO> blogDTONewTop = new ArrayList<>();
        for (Blog e : blogNewTop) {
            BlogDTO temp = new BlogDTO();
            BeanUtils.copyProperties(e, temp);
            temp.setUsername(userService.findOne(e.getUserId()).getUsername());
            blogDTONewTop.add(temp);
        }
        System.out.println(1);
        System.out.println(blogDTOHotTop);
        model.addAttribute("hotTop", blogDTOHotTop);
        model.addAttribute("newTop", blogDTONewTop);
        return "index";
    }
}
