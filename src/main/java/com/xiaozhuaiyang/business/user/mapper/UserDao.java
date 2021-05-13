package com.xiaozhuaiyang.business.user.mapper;

import com.xiaozhuaiyang.business.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zglai
 * Date:22:30 2021/5/13
 * @Description:<描述>
 */
public interface UserDao extends JpaRepository<User,Long> {
}
