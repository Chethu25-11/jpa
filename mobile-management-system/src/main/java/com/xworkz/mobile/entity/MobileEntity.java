package com.xworkz.mobile.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "mobile_info")

public class MobileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobile_id")
private int mobileId;
@Column(name = "name")
private String Name;
@Column(name ="brand")
private String Brand;
@Column(name = "price")
private double Price;
@Column(name = "quantity")
private int Quantity;
@Column(name ="mfd")
private String Mfd;
}
