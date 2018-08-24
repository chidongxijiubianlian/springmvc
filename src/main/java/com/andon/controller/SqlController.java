package com.andon.controller;

import com.andon.pojo.Student;
import com.andon.pojo.User;
import com.andon.pojo.UserDevice;
import com.andon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SqlController {
    @Autowired
    private UserService userService;
    @RequestMapping("/sqlTest")
    @ResponseBody
    public Object getSql(@RequestBody User user)
    {
        User resUser = userService.GetUser(user.getHguid(),user.getName());
        return resUser;
    }
    @RequestMapping("/getByName")
    @ResponseBody
    public Object getUserbyName(String name)
    {
        List<User> userList = userService.GetUserByName(name);
        return  userList;
    }
    @RequestMapping("/getByPoJo")
    @ResponseBody
    public Object getByPoJo(@RequestBody User user)
    {
        User user1 = userService.GetUserByPojo(user);
        return  user1;
    }
    @RequestMapping("/getByIds")
    @ResponseBody
    public Object getByIds(@RequestBody List<User> users)
    {
        List<User> users1 = userService.GetUserByUserIDs(users);
        return users1;
    }
    @RequestMapping("/getUserDevice")
    @ResponseBody
    public Object getUserDevice()
    {
        List<UserDevice> list = userService.GetUserDevice();
        return list;
    }
}
