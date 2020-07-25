package com.example.spring.clothes.service.serviceimp;

import com.example.spring.clothes.entity.UserEntity;
import com.example.spring.clothes.mapper.UserMapper;
import com.example.spring.clothes.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UserEntity> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public UserEntity getUserInfo(String username, String password) {
        return userMapper.getUserInfo(username,password);
    }
}
