package com.example.leosystem.service.impl;

import com.example.leosystem.entity.User;
import com.example.leosystem.mapper.UserMapper;
import com.example.leosystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service //标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器中，不需要在xml文件定义bean
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public String addUser(User user) {
       int ok= userMapper.insert(user);
        return ok==1?"ok":"fail";
    }

    @Override
    public String updateUser(User user) {
        int ok= userMapper.updateById(user);
        return ok==1?"ok":"fail";
    }

    @Override
    public String deleteUser(Long id)throws Exception {
       int ok= userMapper.deleteById(id);
        return ok==1?"ok":"fail";
    }

    @Override
    public List<User> selectUser() {
        return userMapper.selectList(null);
    }

    @Override
    public User selectOneUser(Long id) {
        return userMapper.selectById(id);
    }
}
