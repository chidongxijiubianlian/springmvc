package com.andon.service;

import com.andon.mapper.UserMapper;
import com.andon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> GetUsers()
    {
        List<User> users = userMapper.GetUser();
        return users;
    }
}
