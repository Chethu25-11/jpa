package com.xworkz.movie.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@Table(name = "movie_info")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int movieId;
    @Column(name ="title")
    private String title;
    @Column(name="director")
    private String director;
    @Column(name = "realese_year")
    private int realeaseYear;

}
