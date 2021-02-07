package com.app.server.gamer.service.user.utilities;

import org.springframework.stereotype.Component;

@Component
public class SimpleRegistrationDataChecker implements RegistrationDataChecker{
    @Override
    public boolean checkIfLoginAlreadyUsed() {
        return false;
    }

    @Override
    public boolean checkIfEmailAlreadyUsed() {
        return false;
    }

    @Override
    public boolean checkIfLoginInCorrectForm() {
        return false;
    }

    @Override
    public boolean checkIfEmailInCorrectFOrm() {
        return false;
    }

    @Override
    public boolean checkIfPasswordInCorrectForm() {
        return false;
    }
}
