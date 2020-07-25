package com.example.spring.clothes.mapper;


import com.example.spring.clothes.entity.UserEntity;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //获取所有的数据库的用户信息
    List<UserEntity> getAllUser();

    //依据用户名和用户密码获得用户信息
    UserEntity getUserInfo(@Param(value = "username") String username,
                     @Param(value = "password") String password);
}
