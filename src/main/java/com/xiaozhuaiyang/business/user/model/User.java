package com.xiaozhuaiyang.business.user.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: zglai
 * Date:23:50 2021/4/22
 * @Description:<描述>
 */
@Entity
@Table(name="user")
public class User implements Serializable {
    private static final long seriaVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
