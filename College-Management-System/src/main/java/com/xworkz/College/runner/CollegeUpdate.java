package com.xworkz.College.runner;

import com.xworkz.College.entity.CollegeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CollegeUpdate {
    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("college");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            CollegeEntity entity = em.find(CollegeEntity.class, 1);
            System.out.println("old data: " + entity);
            entity.setAddress("bengaluru");
            CollegeEntity updateEntity = em.merge(entity);
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
