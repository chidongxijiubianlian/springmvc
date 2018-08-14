package com.andon.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.andon.utils.RequestStreamConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class CustomGlobalExceptionResoler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e1) {
        ModelAndView modelAndView = new ModelAndView();
        FastJsonJsonView FastJsonJsonView = new FastJsonJsonView();
        Map<String, Object> attributes = new HashMap<String, Object>();
        //默认请求
        try {
            String pathInfo = httpServletRequest.getRequestURI();
            attributes.put("pathInfo",pathInfo);
            attributes.put("errorMsg",e1.getMessage());
            FastJsonJsonView.setAttributesMap(attributes);
            modelAndView.setView(FastJsonJsonView);
        }catch (Exception e)
        {
            attributes.put("postData","未能解析数据 异常信息为:"+e.getMessage());
        }
        return modelAndView;
    }
}
