package com.imcst.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "123456";
        String pwd = encodePassword(password);
        //$2a$10$QEJcDN3rqlEzs2mUq4BH7O.ns39Lyy0N6iOltgS7qAMuNNtdDSG2m
        System.out.println(pwd);


    }
}
