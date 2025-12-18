package com.xworkz.laptop.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "laptop_info")
public class LaptopEntity {
@Id
    private int Id;
@Column(name = "laptop_name")
    private  String LaptopName;
@Column(name = "price")
    private Double Price;
}
