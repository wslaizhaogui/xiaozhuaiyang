package com.xiaozhuaiyang.business.user.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author zglai
 * @since 2021-07-02
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 菜单ID
     */
        @TableId(value = "menu_id", type = IdType.AUTO)
      private Long menuId;

      /**
     * 菜单名称
     */
      private String menuName;

      /**
     * 父菜单ID
     */
      private Long parentId;

      /**
     * 显示顺序
     */
      private Integer orderNum;

      /**
     * 请求地址
     */
      private String url;

      /**
     * 打开方式（menuItem页签 menuBlank新窗口）
     */
      private String target;

      /**
     * 菜单类型（M目录 C菜单 F按钮）
     */
      private String menuType;

      /**
     * 菜单状态（0显示 1隐藏）
     */
      private String visible;

      /**
     * 是否刷新（0刷新 1不刷新）
     */
      private String isRefresh;

      /**
     * 权限标识
     */
      private String perms;

      /**
     * 菜单图标
     */
      private String icon;

      /**
     * 创建者
     */
      private String createBy;

      /**
     * 创建时间
     */
      private Date createTime;

      /**
     * 更新者
     */
      private String updateBy;

      /**
     * 更新时间
     */
      private Date updateTime;

      /**
     * 备注
     */
      private String remark;


}
