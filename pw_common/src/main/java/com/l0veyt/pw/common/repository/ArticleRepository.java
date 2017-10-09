package com.l0veyt.pw.common.repository;

import com.l0veyt.pw.common.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xin.lee on 2017/10/9.
 * 文章数据访问接口
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}