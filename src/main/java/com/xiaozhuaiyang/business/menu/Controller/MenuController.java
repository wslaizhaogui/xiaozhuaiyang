package com.xiaozhuaiyang.business.menu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MenuController {

    @GetMapping("./getMenuList")
    public String getMenuList(){

        return "";
    }
}
