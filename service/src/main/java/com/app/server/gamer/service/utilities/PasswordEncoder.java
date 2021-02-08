package com.app.server.gamer.service.utilities;

import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

public interface PasswordEncoder {
    byte[] provideSalt();
    String[] provideEncryptedPasswordAndSalt(String password, String salt) throws NoSuchAlgorithmException;
}
