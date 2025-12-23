package com.xworkz.examination.service;

import com.xworkz.examination.entity.ExaminationEntity;

public interface ExaminationService {
    boolean validateAndSaveInventoryInfo(ExaminationEntity entity);
    String validateAndUpdateAllDetailsById(ExaminationEntity entity);
    boolean validateAndDeleteById(int id);
}
