package cn.itcast.service.provider.controller;

import cn.itcast.service.provider.pojo.User;
import cn.itcast.service.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("{id}")
    public User selectByPrimaryKey(@PathVariable("id") Long id) {
        return userService.selectByPrimaryKey(id);
    }
}
