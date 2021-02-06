package com.app.server.gamer.service.user;

import com.app.server.gamer.model.subject.Subject;
import com.app.server.gamer.model.user.User;
import com.app.server.gamer.repository.subject.SubjectRepository;
import com.app.server.gamer.repostiory.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void initUsers() {


        userRepository.saveAll(Stream.of(
                new User("login", "password", "email", "avatar", true, true),
                new User("login2", "password2", "email2", "avatar2", false, true),
                new User("login3", "password3", "email3", "avatar3", false, false))
                .collect(Collectors.toList()));

        Optional<User> user = userRepository.findById(1L);
        System.out.println(user);
    }

    public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);

    }
}
