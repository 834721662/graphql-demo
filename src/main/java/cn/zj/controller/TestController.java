package cn.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zj
 * @since 2018/11/11
 */
@Controller
@RequestMapping(value = "/")
public class TestController {

    @RequestMapping("/home")
    public String homePage() {
        return "home Page";
    }

}
