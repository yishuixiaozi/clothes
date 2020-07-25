package com.example.spring.clothes.service;

import com.example.spring.clothes.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUser();

    UserEntity getUserInfo(String username,String password);
}
