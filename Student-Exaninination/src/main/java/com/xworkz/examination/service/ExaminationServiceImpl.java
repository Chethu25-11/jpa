package com.xworkz.examination.service;

import com.xworkz.examination.entity.ExaminationEntity;
import com.xworkz.examination.repository.Examination;
import com.xworkz.examination.repository.ExaminationImpl;

public class ExaminationServiceImpl implements ExaminationService{
    Examination repository = new ExaminationImpl();

    @Override
    public boolean validateAndSaveInventoryInfo(ExaminationEntity entity) {
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
