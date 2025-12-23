package com.xworkz.inventory.repository;

import com.xworkz.inventory.entity.InventoryEntity;

public interface Inventory {
    boolean saveInventoryInfo(InventoryEntity entity);
    boolean updateItemNameCategoryquantityById(String itemName, String category, int quantity, int id);
    String updateAllDetailsById(InventoryEntity entity);

    boolean deleteById(int id);
    InventoryEntity findInventoryById(int id);
}
