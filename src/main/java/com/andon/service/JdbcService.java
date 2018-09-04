package com.andon.service;

import com.andon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author by yangzhi
 * @date 2018.09.03 17:01
 * @Moode o_O
 **/
@Service
public class JdbcService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public User GetOneUser()
    {
        String sql = "select * from test_user LIMIT 1";
        User user = new User();
        jdbcTemplate.query(sql, new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                return user;
            }
        });
        return user;
    }
}
