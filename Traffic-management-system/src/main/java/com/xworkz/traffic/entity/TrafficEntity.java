package com.xworkz.traffic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "traffic_info")
public class TrafficEntity {

@Column(name = "vehicle_id")
private int vehicleId;
@Column(name ="driver")
        private String Driver;
@Column(name = "route")
private String Route;
}
