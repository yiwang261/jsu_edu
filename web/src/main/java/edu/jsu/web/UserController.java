package edu.jsu.web;

import edu.jsu.ResponseResult;
import edu.jsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yiwang
 * @Date: 2024/7/12
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUsers")
    public ResponseResult getAllUsers() {
        //ResponseResult.success(userService.getAllUsers())
        return ResponseResult.success("成功");
    }

    @RequestMapping("/error")
    public ResponseResult error() {
        return ResponseResult.error("error");
    }
}
