package com.xjtu.blog.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class BlogDTO {

    String username;
    String title;
    String content;
    Date createTime;
    Long likeNum;

}
