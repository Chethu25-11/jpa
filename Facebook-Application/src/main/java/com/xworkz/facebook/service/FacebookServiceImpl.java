package com.xworkz.facebook.service;

import com.xworkz.facebook.entity.FacebookEntity;
import com.xworkz.facebook.repository.Facebook;
import com.xworkz.facebook.repository.FacebookImpl;

public class FacebookServiceImpl implements FacebookService{
Facebook repository = new FacebookImpl();
    @Override
    public boolean validateAndSaveInventoryInfo(FacebookEntity entity) {
        System.out.println("Invoking validation");
        boolean saveValid = false;

        if (entity != null) {
            saveValid = repository.saveInventoryInfo(entity);
        } else {
            saveValid = false;
        }
        return saveValid;
    }
}
