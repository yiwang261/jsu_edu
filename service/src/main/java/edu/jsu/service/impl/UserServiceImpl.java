package edu.jsu.service.impl;

import edu.jsu.mapper.UserMapper;
import edu.jsu.pojo.domain.User;
import edu.jsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yiwang
 * @Date: 2024/7/12
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUser();
    }
}
