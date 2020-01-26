package com.imooc.security.user;

import lombok.Data;


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

}

