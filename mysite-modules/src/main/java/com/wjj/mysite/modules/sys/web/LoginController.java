package com.wjj.mysite.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: WJJ
 * Date: 2018/1/19/019
 * Time: 11:35
 */
@Controller
public class LoginController {

    /**
     * 跳转登录页
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "modules/sys/login";
    }
}
