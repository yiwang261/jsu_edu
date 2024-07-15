package edu.jsu.service;

import edu.jsu.pojo.domain.User;

import java.util.List;

/**
 * @Author: yiwang
 * @Date: 2024/7/12
 */
public interface UserService {
    List<User> getAllUsers();
}
