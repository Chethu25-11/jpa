package com.xworkz.market.runner;

import com.xworkz.market.entity.MarketEntity;

public class MarketRunner {
    public static void main(String[] args) {
        MarketEntity market = new MarketEntity();
        market.setPrice(100.0);
        market.setProductName("tae powder");
        market.setQuantity(100);
    }
}
