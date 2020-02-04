package com.imooc.security.user;

import lombok.Data;
import org.springframework.beans.BeanUtils;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @NotBlank(message = "用户名不能为空")
    //保证数据库这个字段唯一
    @Column(unique = true)
    private String username;

    @NotBlank
    private String password;


    public UserInfo buildInfo() {
        UserInfo info = new UserInfo();
        BeanUtils.copyProperties(this, info);
        return info;
    }

}

