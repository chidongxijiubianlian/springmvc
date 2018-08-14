package com.andon.pojo;

import java.util.Date;

public class User {
    //用户ID 自增
    private Integer id;
    //用户唯一标识
    private String hguid;
    //手机号
    private String phone;
    //名称
    private String name;
    //密码
    private String password;
    //创建时间
    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHguid() {
        return hguid;
    }

    public void setHguid(String hguid) {
        this.hguid = hguid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", hguid='" + hguid + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
