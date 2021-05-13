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
@Entity
@Data
@Table(name="t_user")   //省略默认表名就是user
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username",length = 50)
    private String userName;

    @Column(name = "pingyin",length=50)
    private String pingyin;

    @Column(name = "password",length=50)
    private String passWord;

    @Column(name="email",length = 50)
    private String email;

    @Column(name="IdNumber",length = 50)
    private String IdNumber;
}
