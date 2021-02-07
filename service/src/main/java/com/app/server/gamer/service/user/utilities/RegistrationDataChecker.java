package com.app.server.gamer.service.user.utilities;

public interface RegistrationDataChecker {
    boolean checkIfLoginAlreadyUsed();
    boolean checkIfEmailAlreadyUsed();
    boolean checkIfLoginInCorrectForm();
    boolean checkIfEmailInCorrectFOrm();
    boolean checkIfPasswordInCorrectForm();
}
