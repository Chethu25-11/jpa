package com.xworkz.instagram.runner;

import com.xworkz.instagram.entity.InstagramEntity;

public class InstagramRunner {
    public static void main(String[] args) {
        InstagramEntity instagram = new InstagramEntity();
       instagram.setId(101);
       instagram.setName("chethu");
       instagram.setAccountPrivacy("public");
    }
}
