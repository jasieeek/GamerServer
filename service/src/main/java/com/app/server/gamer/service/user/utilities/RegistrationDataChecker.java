package com.app.server.gamer.service.user.utilities;

import com.app.server.gamer.model.user.User;

import java.util.Optional;

public interface RegistrationDataChecker {
    boolean checkIfLoginAlreadyUsed(String login);
    boolean checkIfEmailAlreadyUsed(String email);
}
