package com.lxl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页视图
 *<dl>
 * <dt>IndexController</dt>
 * <dd>lixinlong</dd>
 * <dd>2018/5/11</dd>
 *</dl>
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "login";
    }
}
