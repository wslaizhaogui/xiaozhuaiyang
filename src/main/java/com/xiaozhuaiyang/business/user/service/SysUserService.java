package com.xiaozhuaiyang.business.user.service;

import com.xiaozhuaiyang.business.user.entity.SysUser;

import java.util.List;

/**
 * @Author: zglai
 * Date:22:38 2021/5/13
 * @Description:<描述>
 */
public interface SysUserService {
    /**
     * 添加用户
     */
    List<SysUser> getUserList();
}
