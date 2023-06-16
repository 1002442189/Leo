package com.example.leosystem.service;

import com.example.leosystem.entity.User;

import java.text.ParseException;
import java.util.List;

public interface UserService {

      //新增
      String addUser(User user) throws ParseException;

    //修改
    String updateUser(User user);

    //删除
    String deleteUser(Long id) throws Exception;

    //查询所有
    List<User> selectUser();

    //查询单个用户
    User selectOneUser(Long id);

    /*对标题或者内容进行模糊搜索*/
    List<User> likeSearch(User user);
}
