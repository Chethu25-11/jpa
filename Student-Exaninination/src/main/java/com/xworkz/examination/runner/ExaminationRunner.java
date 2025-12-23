package com.xworkz.examination.runner;

import com.xworkz.examination.entity.ExaminationEntity;
import com.xworkz.examination.service.ExaminationService;
import com.xworkz.examination.service.ExaminationServiceImpl;

public class ExaminationRunner {
    public static void main(String[] args) {
        ExaminationEntity examination = new ExaminationEntity();

        examination.setName("chethan");
        examination.setRegisterNumber(2002);
        examination.setAddress("bangalore");
        ExaminationService service = new ExaminationServiceImpl();
        service.validateAndSaveInventoryInfo(examination);
        ExaminationEntity examination1 = new ExaminationEntity();
        examination.setName("chethu");
        examination.setRegisterNumber(2012);
        examination.setAddress("tumkur");
        String change = service.validateAndUpdateAllDetailsById(examination1);
        System.out.println("update"+change);
        boolean deleted = service.validateAndDeleteById(1);
        if (deleted) {
            System.out.println("delete successful");
        } else {
            System.out.println("delete failed");
        }
    }
}
