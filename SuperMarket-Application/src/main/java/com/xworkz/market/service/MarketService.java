package com.xworkz.market.service;

import com.xworkz.market.entity.MarketEntity;

public interface MarketService {
    boolean validateAndSaveInventoryInfo(MarketEntity entity);
}
