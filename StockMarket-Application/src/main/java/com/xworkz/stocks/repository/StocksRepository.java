package com.xworkz.stocks.repository;

import com.xworkz.stocks.entity.StocksEntity;

public interface StocksRepository {
    boolean saveStocksInfo(StocksEntity entity);
}
