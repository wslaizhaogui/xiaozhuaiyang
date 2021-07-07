package com.xiaozhuaiyang.business.user.Controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaozhuaiyang.business.user.entity.SysUser;
import com.xiaozhuaiyang.business.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/getUserList")
    public String getUserList() {
        List<SysUser> list = sysUserService.getUserList();
        return JSONObject.toJSONString(list);
    }

}
