package com.xiaozhuaiyang.business.user.service.impl;

import com.xiaozhuaiyang.business.user.model.SysUser;
import com.xiaozhuaiyang.business.user.mapper.SysUserMapper;
import com.xiaozhuaiyang.business.user.service.SysUserService;
import com.xiaozhuaiyang.common.util.RedisUtils;
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

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public List<SysUser> getUserList() {
        List<SysUser> list = sysUserMapper.selectList(null);
        /*redisUtils.set("user",sysUserMapper.selectById("1"));
        System.out.println(redisUtils.get("user"));*/
        return list;
    }

    @Override
    public SysUser getSysUser(String id) {
        SysUser sysUser = (SysUser) redisUtils.get("user");
        if(null == sysUser){
            synchronized (this){
                sysUser = (SysUser) redisUtils.get("user");
                if(sysUser == null){
                    System.out.println("从数据库中获取！");
                    sysUser = sysUserMapper.selectById(id);
                    redisUtils.set("user",sysUser);
                }else{
                    System.out.println("从redis中查询~");
                }
            }
        }else{
            System.out.println("从redis中查询~");
        }
        return sysUser;
    }
}
