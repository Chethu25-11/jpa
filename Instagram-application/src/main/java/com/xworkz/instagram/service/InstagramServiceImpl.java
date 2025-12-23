package com.xworkz.instagram.service;

import com.xworkz.instagram.entity.InstagramEntity;
import com.xworkz.instagram.repository.Instagram;
import com.xworkz.instagram.repository.InstagramImpl;

import java.util.Collections;
import java.util.List;

public class InstagramServiceImpl implements InstagramService {
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

    @Override
    public List<InstagramEntity> validateAndFindAll() {
        System.out.println("invoking validateAndFindAll in service");
        List<InstagramEntity> list = repository.findAllInstagramEntity();
        if (list != null && !list.isEmpty()) {
            System.out.println("is validate" + list.size());
        }

        return list;
    }

    @Override
    public String validateAndUpdateAllDetailsById(InstagramEntity entity) {
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

