package com.example.leosystem.service;

import com.example.leosystem.entity.User;

import java.util.List;

public interface UserService {

      //新增
      String addUser(User user);

    //修改
    String updateUser(User user);

    //删除
    String deleteUser(Long id) throws Exception;

    //查询所有
    List<User> selectUser();

    //查询单个用户
    User selectOneUser(Long id);
}
