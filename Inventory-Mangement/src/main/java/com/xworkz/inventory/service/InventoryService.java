package com.xworkz.inventory.service;
import com.xworkz.inventory.entity.InventoryEntity;
public interface InventoryService {
    boolean validateAndSaveInventoryInfo(InventoryEntity entity);
    boolean validateAndUpdateItemNameCategoryquantityById(String itemName, String category, int quantity, int id);
    String validateAndUpdateAllDetailsById(InventoryEntity entity);
    boolean validateAndDeleteById(int id);
    InventoryEntity validAndFindInventoryById(int id);

}
