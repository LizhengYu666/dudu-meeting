package com.qfjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname DemoController
 * @Author guoweixin
 * @Description TODO
 * @Date 2020/1/7 10:57
 * @Created by Administrator
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    @RequestMapping("info")
    @ResponseBody
    public String info(){
        return "Demo Controlelr测试";
    }
}
