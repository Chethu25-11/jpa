package com.xworkz.facebook.repository;

import com.xworkz.facebook.entity.FacebookEntity;

public interface Facebook {
    boolean saveFacebookInfo(FacebookEntity entity);
    String updateAllDetailsById(FacebookEntity entity);
    boolean deleteById(int Id);
}
