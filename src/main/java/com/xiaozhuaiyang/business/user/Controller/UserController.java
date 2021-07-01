package com.xiaozhuaiyang.business.user.Controller;

import com.xiaozhuaiyang.business.user.model.User;
import com.alibaba.fastjson.JSONObject;
import com.xiaozhuaiyang.business.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zglai
 * Date:22:35 2021/5/13
 * @Description:<描述>
 */
@RestController
@RequestMapping("/system/user")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/getUserList")
    public String getUserList() {
        List<User> list = sysUserService.getUserList();
        return JSONObject.toJSONString(list);
    }
}
