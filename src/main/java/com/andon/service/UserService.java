package com.andon.service;

import com.andon.mapper.UserMapper;
import com.andon.pojo.User;
import com.andon.pojo.UserDevice;
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
        List<User> users = userMapper.GetUsers();
        return users;
    }
    public User GetUser(String hguid,String name)
    {
        User user = userMapper.GetUser(hguid,name);
        return user;
    }

    public List<User> GetUserByName(String name)
    {
        List<User> user = userMapper.GetUserByName(name);
        return user;
    }
    public User GetUserByPojo(User user)
    {
        User user1 =userMapper.GetUserByPojo(user);
        return user1;
    }
    public  List<User> GetUserByUserIDs(List<User> users)
    {
        List<User> user1 =userMapper.GetUserByUserIDs(users);
        return user1;
    }
    public  List<UserDevice> GetUserDevice()
    {
        List<UserDevice> list =userMapper.GetUserDevice();
        return list;
    }
}
