package com.l0veyt.pw.blog.controller;

import com.l0veyt.pw.common.BaseController;
import com.l0veyt.pw.common.MessageResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xin.lee on 2017/10/9.
 * 文章控制器
 */
@Controller
@RestController("/article")
public class ArticleController extends BaseController {

    @GetMapping("/queryAllArticle")
    public MessageResp queryAllArticle() {
        return success();
    }
}