package com.app.server.gamer.service.utilities;

import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

@Service("MD5")
public class MD5PasswordEncoder implements PasswordEncoder {
    @Override
    public byte[] provideSalt() {
        Random rd = new Random();
        byte[] salt = new byte[8];
        rd.nextBytes(salt);
        return salt;
    }

    @Override
    public String[] provideEncryptedPasswordAndSalt(String password, String salt) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] input = password.getBytes(StandardCharsets.UTF_8);
        messageDigest.update(input);
        if (salt == null) {
            byte[] newSalt = provideSalt();
            messageDigest.update(newSalt);
            salt = DatatypeConverter.printHexBinary(newSalt);
        } else {
            byte[] oldSalt = salt.getBytes(StandardCharsets.UTF_8);
            messageDigest.update(oldSalt);
        }
        byte[] output = messageDigest.digest(input);
        String encryptedPassword = DatatypeConverter.printHexBinary(output);
        return new String[]{encryptedPassword, salt};
    }

}
