package com.xworkz.facebook.service;

import com.xworkz.facebook.entity.FacebookEntity;

public interface FacebookService {
    boolean validateAndSaveInventoryInfo(FacebookEntity entity);
    String validateAndUpdateAllDetailsById(FacebookEntity entity);
    boolean validateAndDeleteById(int id);
}
