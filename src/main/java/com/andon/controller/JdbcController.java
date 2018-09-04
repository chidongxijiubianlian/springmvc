package com.andon.controller;

import com.andon.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by yangzhi
 * @date 2018.09.03 17:09
 * @Moode o_O
 **/
@RestController
public class JdbcController {
    @Autowired
    private JdbcService jdbcService;
    @RequestMapping("/getOneUser")
    public Object GetOneUser()
    {
        return jdbcService.GetOneUser();
    }
}
