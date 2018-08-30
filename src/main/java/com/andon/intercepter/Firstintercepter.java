package com.andon.intercepter;

import com.andon.utils.RequestStreamConverter;
import com.sun.javafx.css.converters.StringConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class Firstintercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Map<String,String[]> hashMap = httpServletRequest.getParameterMap();
        System.out.println("=======拦截器:这是一个执行前执行的方法=======");
        HttpSession session = httpServletRequest.getSession();
        String sid = String.valueOf(session.getAttribute("sid"));
        if(sid !=null)
        {
            session.setAttribute("sid","yz");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("=======拦截器:这是一个执行中执行的方法=======");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("=======拦截器:这是一个执行后执行的方法=======");
    }
}
