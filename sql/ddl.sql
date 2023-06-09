create database if not exists luo_study;

use luo_study;

create table if not exists user
(
    userId        char(35)                           not null primary key comment '用户id',
    userAccount   varchar(256)                       null comment '用户名',
    userPassword  varchar(512)                       null comment '密码',
    userAvatar    varchar(1024)                      null comment '头像',
    email         varchar(100)                       null comment '邮箱账号',
    mobile        varchar(256)                       null comment '手机号码',
    gender        tinyint                            null comment '性别',
    birthday      date                               null comment '生日',
    qq            varchar(64)                        null comment 'QQ号码',
    weChat        varchar(256)                       null comment '微信',
    registerTime  datetime default CURRENT_TIMESTAMP not null comment '注册时间',
    lastLoginTime datetime default CURRENT_TIMESTAMP not null not null on update CURRENT_TIMESTAMP comment '最新登录时间',
    isDelete      tinyint  default 0                 not null comment '是否删除',
    constraint uni_userAccount unique (userAccount)
) comment '用户表';