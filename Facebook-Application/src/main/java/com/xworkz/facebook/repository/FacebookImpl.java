package com.xworkz.facebook.repository;

import com.xworkz.facebook.entity.FacebookEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FacebookImpl implements Facebook{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Examination");
    @Override
    public boolean saveInventoryInfo(FacebookEntity entity) {
        System.out.println("Inserting data");
        boolean insert = false;


        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            insert = true;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
            insert = false;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return insert;
    }

}
