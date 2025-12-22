package com.xworkz.facebook.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "facebook_info")
public class FacebookEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "user_name")
    private String UserName;
    @Column(name = "account_privacy")
    private String AccountPrivacy;
    @Column(name = "followers")
    private int Followers;
}
