package com.xworkz.market.service;

import com.xworkz.market.entity.MarketEntity;
import com.xworkz.market.entity.repository.Market;
import com.xworkz.market.entity.repository.MarketImpl;

public class MarketServiceImpl {
    Market repository = new MarketImpl();
    @Override
    public boolean validateAndSaveInventoryInfo(MarketEntity entity) {
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
