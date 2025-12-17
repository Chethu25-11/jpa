package com.xworkz.sports.runner;

import com.xworkz.sports.entity.SportsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsRunner {
    public static void main(String[] args) {
        SportsEntity entity = new SportsEntity();

        entity.setPlayer("Prashant");
        entity.setLocation("tumkur");


        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("sports");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (emf != null) {
                emf.close();
            }
            if (em != null) {
                em.close();
            }
        }
    }
}
