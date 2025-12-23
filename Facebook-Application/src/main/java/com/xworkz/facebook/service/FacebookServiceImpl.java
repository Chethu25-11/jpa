package com.xworkz.facebook.service;

import com.xworkz.facebook.entity.FacebookEntity;
import com.xworkz.facebook.repository.Facebook;
import com.xworkz.facebook.repository.FacebookImpl;

public class FacebookServiceImpl implements FacebookService {
    Facebook repository = new FacebookImpl();

    @Override
    public boolean validateAndSaveInventoryInfo(FacebookEntity entity) {
        System.out.println("Invoking validation");
        boolean saveValid = false;

        if (entity != null) {
            saveValid = repository.saveFacebookInfo(entity);
        } else {
            saveValid = false;
        }
        return saveValid;
    }

    @Override
    public String validateAndUpdateAllDetailsById(FacebookEntity entity) {
        System.out.println("Invoking validation");
        String isValid = null;

        if (entity != null) {
            isValid = repository.updateAllDetailsById(entity);
        } else {
            System.out.println("Validation failed");
        }
        return isValid;
    }

    @Override
    public boolean validateAndDeleteById(int id) {
        System.out.println("Invoking validation");
        boolean validDelete = false;
        if (id>0) {
            validDelete = repository.deleteById(id);
        } else {
            validDelete = false;
        }
        return validDelete;
    }
}
