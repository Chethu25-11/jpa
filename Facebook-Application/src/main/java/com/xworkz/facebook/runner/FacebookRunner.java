package com.xworkz.facebook.runner;

import com.xworkz.facebook.entity.FacebookEntity;
import com.xworkz.facebook.service.FacebookService;
import com.xworkz.facebook.service.FacebookServiceImpl;

public class FacebookRunner {
    public static void main(String[] args) {
        FacebookEntity facebook = new FacebookEntity();
        facebook.setUserName("vinay");
        facebook.setFollowers(100);
        facebook.setAccountPrivacy("private");

        FacebookService facebookService = new FacebookServiceImpl();
        boolean insert = facebookService.validateAndSaveInventoryInfo(facebook);

        System.out.println("Insert status: " + insert);
        String change = facebookService.validateAndUpdateAllDetailsById(facebook);
        System.out.println("insert satus" + change);
        boolean deleted = facebookService.validateAndDeleteById(4);
        if (deleted) {
            System.out.println("delete successful");
        } else {
            System.out.println("delete failed");
        }
    }
}
