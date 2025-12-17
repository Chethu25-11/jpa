package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.HotelEntity;

public class HotelRunner {
    public static void main(String[] args) {
        HotelEntity entity = new HotelEntity();
        entity.setvehicleId("1");
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
