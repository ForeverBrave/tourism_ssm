package com.it.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    private static String encodePassword(String password){return bCryptPasswordEncoder.encode(password);}

    public static void main(String[] args) {
        String password = "123";
        String pwd = encodePassword(password);

        System.out.println(pwd);
    }
}
