package com.xworkz.examination.repository;

import com.xworkz.examination.entity.ExaminationEntity;

public interface Examination {
    boolean saveInventoryInfo(ExaminationEntity entity);
    boolean updateItemNameCategoryquantityById(String Name, int RegisterNumber, String Address, int Id);
}
