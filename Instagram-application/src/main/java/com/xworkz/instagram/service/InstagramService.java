package com.xworkz.instagram.service;

import com.xworkz.instagram.entity.InstagramEntity;

import java.util.List;

public interface InstagramService {
    boolean validateAndSaveInventoryInfo(InstagramEntity entity);
List<InstagramEntity> validateAndFindAll();
    String validateAndUpdateAllDetailsById(InstagramEntity entity);
    boolean validateAndDeleteById(int id);

}
