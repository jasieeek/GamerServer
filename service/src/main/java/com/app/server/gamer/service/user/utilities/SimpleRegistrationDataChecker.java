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

}
