package com.app.server.gamer.service.user;

import com.app.server.gamer.model.user.User;
import com.app.server.gamer.model.user.UserDTO;
import com.app.server.gamer.repostiory.user.UserRepository;
import com.app.server.gamer.service.activationLink.ActivationLinkService;
import com.app.server.gamer.service.user.utilities.RegistrationDataChecker;
import com.app.server.gamer.service.utilities.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.NoSuchAlgorithmException;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    @Qualifier("MD5")
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RegistrationDataChecker registrationDataChecker;
    @Autowired
    private ActivationLinkService activationLinkService;

    @PostConstruct
    public void initUsers() {
    }

    public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void activateUser(User user) {
        user.setActivated(true);
        userRepository.save(user);
    }

    public String saveUser(UserDTO userDTO) {
        String login = userDTO.getLogin();
        String[] passwordAndSalt = new String[2];
        try {
            passwordAndSalt = passwordEncoder.provideEncryptedPasswordAndSalt(userDTO.getPassword(), null);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String email = userDTO.getEmail();
        boolean loginNotUsed = !registrationDataChecker.checkIfLoginAlreadyUsed(login);
        boolean emailNotUsed = !registrationDataChecker.checkIfEmailAlreadyUsed(email);
        if (loginNotUsed && emailNotUsed) {
            User newUser = new User(login, passwordAndSalt[0], passwordAndSalt[1], email, null, false, false, false);
            userRepository.save(newUser);
            activationLinkService.serveRegistration(newUser);
            return "userSaved";
        } else if (!loginNotUsed) return "loginTaken";
        return "emailTaken";
    }


}
