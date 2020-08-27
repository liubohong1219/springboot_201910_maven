package com.colin.service.impl;

import com.colin.bean.User;
import com.colin.mapper.UserMapper;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: DengLong
 * Date: 2020-07-16
 * Time: 19:07
 */
@Service
public class UserSerivceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
