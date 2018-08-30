package com.andon.controller;

import com.andon.pojo.User;
import com.andon.service.MongoService;
import com.andon.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by yangzhi
 * @date 2018.08.30 13:36
 * @Moode o_O
 **/
@RestController
public class MongoController {
    @Autowired
    private MongoService mongoService;
    @RequestMapping("/addMongo")
    public Object addMongo(@RequestBody User user)
    {
        mongoService.insert(user);
        return "Success";
    }
}
