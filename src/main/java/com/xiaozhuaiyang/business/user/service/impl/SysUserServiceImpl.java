package com.xiaozhuaiyang.business.user.service.impl;

import com.xiaozhuaiyang.business.user.entity.SysUser;
import com.xiaozhuaiyang.business.user.mapper.SysUserMapper;
import com.xiaozhuaiyang.business.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zglai
 * Date:22:39 2021/5/13
 * @Description:<描述>
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getUserList() {
        List<SysUser> list = sysUserMapper.selectList(null);
        return list;
    }
}
