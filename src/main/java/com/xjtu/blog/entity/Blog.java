package com.xjtu.blog.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nid;

    private Long userId;

    private String title;

    private String content;

    private Long likeNum;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;

}
