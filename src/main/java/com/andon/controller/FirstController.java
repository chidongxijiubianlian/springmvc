package com.andon.controller;

import com.andon.pojo.Student;
import com.andon.pojo.User;
import com.andon.service.FirstService;
import com.andon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.util.List;

@Controller
public class FirstController {
    @Autowired
    private FirstService firstService;
    @Autowired
    private UserService userService;
    @RequestMapping("/getIndex")
    @ResponseBody//有了此注解 变为restful风格的api
    public String getIndex(HttpServletRequest httpServletRequest) throws Exception {
        BufferedReader br = httpServletRequest.getReader();
        String str, wholeStr = "";
        while((str = br.readLine()) != null){
            wholeStr += str;
        }
        System.out.println(wholeStr);
//        String bodyStr ="";
//        ServletInputStream stream = httpServletRequest.getInputStream();
//        byte[] bytes =new byte[httpServletRequest.getContentLength()];
//        stream.read(bytes,0,bytes.length);
//        bodyStr = new String(bytes,"UTF-8");
//        System.out.println(bodyStr);
        return "index";
    }
    @RequestMapping("/getIndex2")
    public String getIndex2() {
        return firstService.getIndex();
    }
    @RequestMapping("/uploadFile")
    @ResponseBody//有了此注解 变为restful风格的api
    public Object upLoad(@RequestBody MultipartFile someFile, HttpServletRequest httpServletRequest)
    {
        String msg = someFile.getOriginalFilename();
        return msg;
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public Object getUser(HttpServletRequest httpServletRequest)
    {
        HttpSession session =httpServletRequest.getSession();
        String sid =String.valueOf(session.getAttribute("sid"));
        List<User> users = userService.GetUsers();
        return users+sid;
    }
    @ResponseBody//此注解指的是不返回页面
    @RequestMapping("/UrlEncode")
    //接收contentType为x-www-urlencoded
    public Object getUrlEncode(Student student)
    {
        return student;
    }
    @ResponseBody//此注解指的是不返回页面
    @RequestMapping("/ApplicationJson")
    //接收contentType为www-urlencode @RequestBody为解析json的解析器 记得加jar包:jackson-databind
    public Object getApplicationJson(@RequestBody Student student)
    {
        return student;
    }
    @ResponseBody//此注解指的是不返回页面
    @RequestMapping("/Binary")
    //接收contentType为binary
    public Object getBinary(@RequestBody MultipartFile file) throws Exception
    {
        byte[] bytes = new byte[(int)file.getSize()];
        InputStream stream = file.getInputStream();
        stream.read(bytes,0,bytes.length);//一次性读出来不考虑性能
        FileImageOutputStream imageOutput = new FileImageOutputStream(new File("F:\\saveImg\\"+file.getOriginalFilename()));
        imageOutput.write(bytes, 0, bytes.length);//将byte写入硬盘
        imageOutput.close();
        return "success";
    }
    @ResponseBody//此注解指的是不返回页面
    @RequestMapping("/getError")
    //接收contentType为binary
    public Object getError(@RequestBody Student student) throws Exception
    {
        String str ="b";
        int a =Integer.parseInt(str);
        return student;
    }

}
