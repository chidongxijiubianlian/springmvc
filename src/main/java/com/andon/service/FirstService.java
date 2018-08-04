package com.andon.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FirstService {
    public String getIndex()
    {
        return "index";
    }
}
