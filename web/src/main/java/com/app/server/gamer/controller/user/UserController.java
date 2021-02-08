package com.app.server.gamer.controller.user;

import com.app.server.gamer.model.user.User;
import com.app.server.gamer.model.user.UserDTO;
import com.app.server.gamer.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(path="app/registration", method= RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserDTO userDTO){
        String response = userService.saveUser(userDTO);
        //for test
        System.out.println(response);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
