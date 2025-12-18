package com.xworkz.hospital.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@Table(name = "hospital_info")
public class HospitalEntity {
    @Id
    private int Id;
    @Column(name = "doctor_name")
    private String DoctorName;
    @Column(name = "address")
    private String Address;

}
