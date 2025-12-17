package com.xworkz.sports.entity;
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
@Table(name = "sports_info")
public class SportsEntity {
    @Column(name = "team_id")
    private int TeamId;
    @Column(name ="player_name")
    private String Player;
    @Column(name = "location")
    private String Location;
}


