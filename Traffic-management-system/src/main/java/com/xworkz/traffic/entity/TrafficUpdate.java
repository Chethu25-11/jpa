package com.xworkz.traffic.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficUpdate {
    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("traffic");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            TrafficEntity entity = em.find(TrafficEntity.class, 1);
            System.out.println("old data: " + entity);
            entity.setRoute("bengaluru");
            TrafficEntity updateEntity = em.merge(entity);
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
