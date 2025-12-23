package com.xworkz.instagram.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "instagram_info")
@NamedQuery(name = "findAllInstagramEntity", query = "SELECT m from InstagramEntity m")
public class InstagramEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "account_privacy")
    private String AccountPrivacy;
}
