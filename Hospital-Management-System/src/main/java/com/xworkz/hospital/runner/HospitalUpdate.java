package com.xworkz.hospital.runner;

import com.xworkz.hospital.entity.HospitalEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalUpdate {
    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("hospital");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            HospitalEntity entity = em.find(HospitalEntity.class, 1);
            System.out.println("old data: " + entity);
            entity.setDoctorName("praksh");
            HospitalEntity updateEntity = em.merge(entity);
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
