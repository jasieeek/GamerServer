package com.app.server.gamer.controller.user;

import com.app.server.gamer.model.user.User;
import com.app.server.gamer.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
