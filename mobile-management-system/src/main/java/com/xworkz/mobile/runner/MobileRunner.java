package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileRunner {
    public static void main(String[] args) {


            MobileEntity entity = new MobileEntity();
            entity.setName("poco");
            entity.setBrand("f7");
            entity.setPrice(29000);
            entity.setQuantity(100);
            entity.setMfd("2022-01-01");


//        MobileService service = new MobileServiceImpl();
//        String result = service.validateAndSave(entity);
//        System.out.println("Result: " + result);

            MobileService mobileService = new MobileServiceImpl();
            boolean response = mobileService.validateAndUpdatePriceQuantityMfdById(51000, 120, "2025-06-06", 3);
            if (response) {
                System.out.println("update successfull");
            } else {
                System.out.println("update failed");
            }

            MobileEntity entity1 = new MobileEntity();

            entity1.setMobileId(4);
            entity1.setName("poco");
            entity1.setBrand("x7pro");
            entity1.setPrice(29000);
            entity1.setQuantity(200);
            entity1.setMfd("2023-01-01");

            MobileService mobileService1 = new MobileServiceImpl();
            MobileEntity result = mobileService1.validateAllDetailsById(entity1);
            System.out.println(result);
        }

    }


