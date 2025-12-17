package com.xworkz.traffic.runner;

import com.xworkz.traffic.entity.TrafficEntity;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;



public class TrafficRunner {
    public static void main(String[] args) {
        TrafficEntity entity = new TrafficEntity();

        entity.setDriver("Prashant");
        entity.setRoute("tumkur");


        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("traffic");
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

