package com.imooc.security.user;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserRepository userRepository;
    public UserInfo Create(UserInfo info) {
        User user = new User();
        BeanUtils.copyProperties(info, user);
        //	user.setPassword(SCryptUtil.scrypt(user.getPassword(), 32768, 8, 1));
        userRepository.save(user);
        info.setId(user.getId());
        return info;
    }

    public UserInfo update(UserInfo UserInfo) {
        return null;
    }

    public void delete(Long id) {

    }

    public UserInfo get(Long id) {
        return null;
    }


    public List<UserInfo> query(String name) {
        return null;
    }
}
