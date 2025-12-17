package com.xworkz.Ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EcommerceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;
    @Column(name ="name")
    private String Name;
    @Column(name="order_address")
    private String OrderAddress;


}
