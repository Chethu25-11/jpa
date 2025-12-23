package com.xworkz.examination.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Entity
@Setter
@ToString
@Table(name ="examination_info" )
public class ExaminationEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int Id;
    @Column(name = "name")
private String Name;
    @Column(name = "register_number")
private int RegisterNumber;
    @Column(name = "address")
private String Address;
}
