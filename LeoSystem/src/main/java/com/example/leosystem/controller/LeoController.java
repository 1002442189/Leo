package com.example.leosystem.controller;

import com.example.leosystem.entity.User;
import com.example.leosystem.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("leo")
public class LeoController {
@Resource
private UserMapper userMapper;
    @GetMapping("en")
    public String leo(int id){
        List<User> userList=userMapper.selectList(null);
        userList.forEach(System.out::println);
      return "Liu En Yun";

    }
}
