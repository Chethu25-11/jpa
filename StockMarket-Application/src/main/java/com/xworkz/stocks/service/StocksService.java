package com.xworkz.stocks.service;

import com.xworkz.stocks.entity.StocksEntity;

public interface StocksService {
    boolean validateAndSaveStocksInfo(StocksEntity entity);
}
