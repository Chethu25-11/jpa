package com.xworkz.examination.repository;

import com.xworkz.examination.entity.ExaminationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExaminationImpl implements Examination {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("examination");

    @Override
    public boolean saveInventoryInfo(ExaminationEntity entity) {
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

    @Override
    public String updateAllDetailsById(ExaminationEntity entity) {
        System.out.println("Update details by Id");
        String isUpdate = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            ExaminationEntity entityUpdate = em.find(ExaminationEntity.class, 2);
            entityUpdate.setName(entity.getName());
            entityUpdate.setName(entity.getName());
            et.commit();
            isUpdate = "successfully done";
            System.out.println("OLD: " + entityUpdate.getName());
            System.out.println("NEW: " + entity.getName());

        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return isUpdate;
    }

    @Override
    public boolean deleteById(int Id) {
        System.out.println("deleting using id");
        boolean isdelete = false;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            ExaminationEntity entity = em.find(ExaminationEntity.class, Id);
            em.remove(entity);
            et.commit();
            isdelete = true;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return isdelete;
    }

}
