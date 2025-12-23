package com.xworkz.instagram.runner;

import com.xworkz.instagram.entity.InstagramEntity;
import com.xworkz.instagram.service.InstagramService;
import com.xworkz.instagram.service.InstagramServiceImpl;

import java.util.List;

public class InstagramRunner {
    public static void main(String[] args) {
        InstagramEntity instagram = new InstagramEntity();

        instagram.setName("chethu");
        instagram.setAccountPrivacy("public");
        InstagramService instagramService = new InstagramServiceImpl();
        // instagramService.validateAndSaveInventoryInfo(instagram);
        // List<InstagramEntity> listOfInstagramEntity = instagramService.validateAndFindAll();
        // System.out.println(listOfInstagramEntity);

        InstagramEntity instagram1 = new InstagramEntity();
        instagram1.setName("suman");
        instagram1.setAccountPrivacy("private");
        //  String change = instagramService.validateAndUpdateAllDetailsById(instagram1);
        // System.out.println(change + "...................");
        boolean deleted = instagramService.validateAndDeleteById(1);
        if (deleted) {
            System.out.println("delete successful");
        } else {
            System.out.println("delete failed");
        }
    }
}
