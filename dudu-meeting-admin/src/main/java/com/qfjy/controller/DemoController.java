package com.qfjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname DemoController
 * @Author guoweixin
 * @Description TODO
 * @Date 2020/1/7 11:06
 * @Created by Administrator
 */
@Controller
@ResponseBody
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("info")
    public String info(){
        return " 8081-- 测试Controller admin";
    }
}
