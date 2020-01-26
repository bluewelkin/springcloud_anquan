package com.imooc.security.user;

import com.imooc.security.user.UserInfo;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
/*
    @Autowired
    private JdbcTemplate jdbcTemplate;*/

@Autowired
private  UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping
    public UserInfo Create(@RequestBody  UserInfo info){
        return userService.Create(info);
    }

    @PutMapping("/{id}")
    public UserInfo update(@RequestBody  UserInfo UserInfo){
        return UserInfo;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
    }

    @GetMapping("/{id}")
    public UserInfo get(@PathVariable Long id){
        System.out.println("laidaozheli");
        return  new UserInfo();
    }

    @GetMapping
    public List query(String name){
/*        System.out.println("laidao");
        String sql = "select * from UserInfo where name = '"+name+"'";
        List data = jdbcTemplate.queryForList(sql);*/
     return userRepository.findByName(name);

    }

}
