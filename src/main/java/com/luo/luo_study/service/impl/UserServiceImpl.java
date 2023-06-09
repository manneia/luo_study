package com.luo.luo_study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luo.luo_study.model.entity.User;
import com.luo.luo_study.service.UserService;
import com.luo.luo_study.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author lkx
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-06-09 17:50:56
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




