package com.xworkz.movie.runner;

import com.xworkz.movie.entity.MovieEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MovieDelete {

    EntityManagerFactory emf = null;
    EntityManager em = null;
    EntityTransaction et = null;
        try {
        emf = Persistence.createEntityManagerFactory("movies");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();

        et.commit();
    } catch (Exception e) {
        et.rollback();
        e.printStackTrace();
    } finally {
        if (emf != null) {
            emf.close();

        }
    }
}




