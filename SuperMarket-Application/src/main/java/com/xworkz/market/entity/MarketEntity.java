package com.xworkz.market.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString

@Table(name = "market_info")
public class MarketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name="product_name")
    private String ProductName;
    @Column(name = "price")
    private double Price;
    @Column(name = "quantity")
    private int Quantity;
}
