package com.app.server.gamer.service.utilities;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class test {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MD5PasswordEncoder md5PasswordEncoder = new MD5PasswordEncoder();
        String xx = "";
        String xx2 = md5PasswordEncoder.encryptPassword(xx, "4034C1E3FB44F69C");
        System.out.println(md5PasswordEncoder.getSalt());
        System.out.println(xx2);
    }
}
