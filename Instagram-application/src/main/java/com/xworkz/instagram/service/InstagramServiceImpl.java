package com.xworkz.instagram.service;

import com.xworkz.instagram.entity.InstagramEntity;
import com.xworkz.instagram.repository.Instagram;
import com.xworkz.instagram.repository.InstagramImpl;

public class InstagramServiceImpl implements InstagramService{
    Instagram repository = new InstagramImpl();
    @Override
    public boolean validateAndSaveInventoryInfo(InstagramEntity entity) {
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
