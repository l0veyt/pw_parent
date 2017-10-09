package com.l0veyt.pw.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by xin.lee on 2017/10/9.
 * 文章实体类
 */
@Data
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Integer articleId;

    @Column
    private String articleUuid;

    @Column
    private String articleTitle;

    @Column
    private Date createTime;

    @Column
    private Date lastUpdateTime;

    @Column
    private Integer delFlag;
}