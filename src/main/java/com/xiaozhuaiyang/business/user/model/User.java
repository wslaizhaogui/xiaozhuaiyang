package com.xiaozhuaiyang.business.user.model;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @Author: zglai
 * Date:23:50 2021/4/22
 * @Description:<描述>
 */
@Data
@TableName("sys_user")
public class User implements Serializable {
    private Long userId;
    private Long deptId;
    private String loginName;
}
