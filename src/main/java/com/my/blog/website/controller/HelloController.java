package com.my.blog.website.controller;

import com.my.blog.website.service.IAttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 86178
 * @create 2022/12/26 17:44
 */
@Controller
public class HelloController {

    @Autowired
    private IAttachService attachService;

    @ResponseBody
    @RequestMapping("/hello")
    public void process(){

    }
}
