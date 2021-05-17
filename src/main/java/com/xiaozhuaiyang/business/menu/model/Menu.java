package com.xiaozhuaiyang.business.menu.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="t_menu")
public class Menu {

    @Column(length = 50)
    private String menuId;

    @Column(length = 50)
    private String pid;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String url;

}
