package com.imooc.security.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserService {

     UserInfo Create(UserInfo UserInfo);


     UserInfo update(UserInfo UserInfo);

     void delete( Long id);


     UserInfo get( Long id);


     List<UserInfo> query(String name);
}
