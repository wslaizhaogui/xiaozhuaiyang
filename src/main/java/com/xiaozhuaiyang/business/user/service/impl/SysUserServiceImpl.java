package com.xiaozhuaiyang.business.user.service.impl;

import com.xiaozhuaiyang.business.user.entity.SysUser;
import com.xiaozhuaiyang.business.user.mapper.SysUserMapper;
import com.xiaozhuaiyang.business.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    RedisTemplate redisTemplate;

    @Override
    public List<SysUser> getUserList() {
        List<SysUser> list = sysUserMapper.selectList(null);
        redisTemplate.opsForValue().set("user","aaaa");
        return list;
    }

    @Override
    public SysUser getSysUser(String id) {
        SysUser sysUser = (SysUser) redisTemplate.opsForValue().get("user");
        if(null == sysUser){
            System.out.println("从数据库中获取！");
            sysUser = sysUserMapper.selectById(id);
            redisTemplate.opsForValue().set("user",sysUser);
        }else{
            System.out.println("从redis中查询~");
        }
        return sysUser;
    }
}
