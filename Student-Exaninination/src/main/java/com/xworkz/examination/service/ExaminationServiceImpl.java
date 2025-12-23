package com.xworkz.examination.service;

import com.xworkz.examination.entity.ExaminationEntity;
import com.xworkz.examination.repository.Examination;
import com.xworkz.examination.repository.ExaminationImpl;

public class ExaminationServiceImpl implements ExaminationService {
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

    @Override
    public String validateAndUpdateAllDetailsById(ExaminationEntity entity) {
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
