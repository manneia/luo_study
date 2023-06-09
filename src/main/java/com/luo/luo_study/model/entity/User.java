package com.luo.luo_study.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @author lkx
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId
    private String userId;

    /**
     * 用户名
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 邮箱账号
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 微信
     */
    private String weChat;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 最新登录时间
     */
    private Date lastLoginTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}