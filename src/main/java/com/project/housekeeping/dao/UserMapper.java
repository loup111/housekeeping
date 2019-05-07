package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //根据当前登录的用户名查找用户信息
    Login SelectLoginByName(
            @Param("username") String username,
            @Param("password") String password
            );

}
