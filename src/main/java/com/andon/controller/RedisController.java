package com.andon.controller;

import com.andon.pojo.User;
import com.andon.service.RedisService;
import com.andon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by yangzhi
 * @date 2018.08.27 17:14
 * @Moode o_O
 **/
@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;
    @RequestMapping("/addRedis")
    public Object addRedis(String value)
    {
        Boolean aBoolean = redisService.set("testRe:yz",value);
        if(aBoolean)
        {
            return "1";
        }else{
            return "0";
        }
    }
}
