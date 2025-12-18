package com.xworkz.laptop.runner;

import com.xworkz.laptop.entity.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopEntity entity = new LaptopEntity();

        entity.setLaptopName("lenovo");
        entity.setPrice(1000.0);


        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("laptop");
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
