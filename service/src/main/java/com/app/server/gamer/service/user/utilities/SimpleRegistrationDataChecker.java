package com.app.server.gamer.service.user.utilities;

import com.app.server.gamer.model.user.User;
import com.app.server.gamer.repostiory.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SimpleRegistrationDataChecker implements RegistrationDataChecker{

    @Autowired
    UserRepository userRepository;


    @Override
    public boolean checkIfLoginAlreadyUsed(String login) {
        User user = userRepository.findUserByLogin(login);
        return user == null ? false : true;
    }

    @Override
    public boolean checkIfEmailAlreadyUsed(String email) {
        User user = userRepository.findUserByEmail(email);
        return user == null ? false : true;
    }

}
