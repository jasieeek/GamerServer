package com.app.server.gamer.controller.user;

import com.app.server.gamer.model.user.User;
import com.app.server.gamer.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "app/getUsers")
    public ResponseEntity<?> getUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }  
    @GetMapping(value = "app/getUser/{id}")
    public ResponseEntity<?> getUserById(@PathVariable String id){
        Optional<User> user = Optional.of(userService.getUserById(Integer.parseInt(id)));
        return user.isPresent() ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
    }
}
