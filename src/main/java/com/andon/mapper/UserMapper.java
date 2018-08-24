package com.andon.mapper;

import com.andon.pojo.User;
import com.andon.pojo.UserDevice;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
public interface UserMapper {
    List<User> GetUsers();
    User GetUser(String uid,String name);
    List<User> GetUserByName(String name);
    User GetUserByPojo(User name);
    List<User> GetUserByUserIDs(List<User> users);
    List<UserDevice> GetUserDevice();
}
