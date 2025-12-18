package com.xworkz.College.entity;

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
@Table(name = "college_info")
public class CollegeEntity {
    @Id
    private int Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "address")
    private String Address;

}
