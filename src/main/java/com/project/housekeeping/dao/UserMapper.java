package com.project.housekeeping.dao;

import org.apache.ibatis.annotations.Mapper;
import org.sang.housekeeping.entity.Login;

@Mapper
public interface UserMapper {
    //根据当前登录的用户名查找用户信息
    Login SelectLoginByName(String name);
}
