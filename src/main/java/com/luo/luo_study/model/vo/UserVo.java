package com.luo.luo_study.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 脱敏用户表
 *
 * @author lkx
 * @TableName user
 */
@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = 7815017620466048931L;
    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userAccount;

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
}