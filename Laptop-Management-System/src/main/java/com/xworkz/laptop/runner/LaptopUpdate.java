package com.xworkz.laptop.runner;

import com.xworkz.laptop.entity.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LaptopUpdate {
    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("laptop");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            LaptopEntity entity = em.find(LaptopEntity.class, 1);
            System.out.println("old data: " + entity);
            entity.setLaptopName("hp");
            LaptopEntity updateEntity = em.merge(entity);
            System.out.println("update data: " + updateEntity);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
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
