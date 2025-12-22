package com.xworkz.mobile.repository;

import com.xworkz.mobile.entity.MobileEntity;

public interface MobileRepository {
String saveMobileInfo(MobileEntity entity);
boolean updatePriceQuantityMfdById(double price,int quantity,String mfd,int mobileId);
    MobileEntity updateAllDetailsById(MobileEntity entity);

    MobileEntity findMobileEntityById(int id);
}
