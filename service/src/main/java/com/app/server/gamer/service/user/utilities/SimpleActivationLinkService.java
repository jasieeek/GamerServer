package com.app.server.gamer.service.user.utilities;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SimpleActivationLinkService implements ActivationLinkService {
    @Override
    public String generateLink() {
        Random random = new Random();
        String numbers = "";
        for(int i=0; i<8; i++){
            numbers+=random.nextInt();
        }
        return numbers;
    }

    @Override
    public void associateLinkWithUser() {

    }

    @Override
    public void deleteLinkAfterActivation() {

    }
}
