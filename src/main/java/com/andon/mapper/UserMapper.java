package com.andon.mapper;

import com.andon.pojo.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
public interface UserMapper {
    List<User> GetUser();
}
