package com.xworkz.stocks.service;

import com.xworkz.stocks.entity.StocksEntity;

public class StocksServiceImpl implements StocksService{
    StocksService repository = new StocksServiceImpl();
    @Override
    public boolean validateAndSaveStocksInfo(StocksEntity entity) {
        System.out.println("Invoking validation");
        boolean saveValid = false;

        if (entity != null) {
            saveValid = repository.saveInventoryInfo(entity);
        } else {
            saveValid = false;
        }
        return false;
    }
}
