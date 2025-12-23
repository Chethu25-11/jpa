package com.xworkz.instagram.repository;

import com.xworkz.instagram.entity.InstagramEntity;

import java.util.List;

public interface Instagram {
    boolean saveInventoryInfo(InstagramEntity entity);
    List<InstagramEntity> findAllInstagramEntity();
    String updateAllDetailsById(InstagramEntity entity);
    boolean deleteById(int Id);
}
