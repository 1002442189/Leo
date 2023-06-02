package com.example.leosystem.controller;

import com.example.leosystem.entity.User;
import com.example.leosystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("leo")
public class LeoController {

    @Autowired//可以标注在属性上，方法上和构造器上，来完成自动装配
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
      return userService.addUser(user);
    }


    @PostMapping("/delete")
    public String deleteUser(@RequestBody User user){
        String ok="fail";
      try {
         userService.deleteUser(user.getId());
      }catch (Exception e){
          return e.getMessage();
      }
        return ok;
    }

    @PostMapping("/selectlist")
    public List<User> selectListUser(){
        return userService.selectUser();
    }

    @PostMapping("/selectone")
    public User selectOneUser(@RequestBody User user){
        return userService.selectOneUser(user.getId());
    }
    @PostMapping("/update")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


}
