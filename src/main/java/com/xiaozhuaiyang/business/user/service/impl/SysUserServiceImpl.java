package com.xiaozhuaiyang.business.user.service.impl;

import com.xiaozhuaiyang.business.user.mapper.UserDao;
import com.xiaozhuaiyang.business.user.model.User;
import com.xiaozhuaiyang.business.user.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zglai
 * Date:22:39 2021/5/13
 * @Description:<描述>
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private UserDao userDao;

    @Override
    public String addUser(User user) {
        User u = userDao.save(user);
        return u==null?"false":"success";
    }
}
