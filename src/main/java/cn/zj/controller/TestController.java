package cn.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zj
 * @since 2018/11/11
 */
@Controller
@RequestMapping(value = "/home")
public class TestController {

    @RequestMapping("/page")
    public String homePage() {
        System.out.println("qwe");
        return "home Page";
    }

}
