package com.xjtu.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @RequestMapping("")
    String index() {
        return "index";
    }
}
