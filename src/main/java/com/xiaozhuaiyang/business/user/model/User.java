package com.xiaozhuaiyang.business.user.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;


/**
 * @Author: zglai
 * Date:23:50 2021/4/22
 * @Description:<描述>
 */
@Data
public class User implements Serializable {
    private Long userId;
    private Long deptId;
    private String longName;
}
