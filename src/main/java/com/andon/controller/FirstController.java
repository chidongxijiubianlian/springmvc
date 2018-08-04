package com.andon.controller;

import com.andon.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @Autowired
    private FirstService firstService;
    @RequestMapping("/getIndex")
    public String getIndex() {
        return firstService.getIndex();
    }
}
