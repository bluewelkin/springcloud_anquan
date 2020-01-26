package com.imooc.security.user;

import lombok.Data;
import org.springframework.beans.BeanUtils;


import javax.persistence.*;

@Entity
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String username;

    private String password;


    public UserInfo buildInfo() {
        UserInfo info = new UserInfo();
        BeanUtils.copyProperties(this, info);
        return info;
    }

}

