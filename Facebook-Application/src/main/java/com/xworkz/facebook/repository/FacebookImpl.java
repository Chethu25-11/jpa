package com.xworkz.facebook.repository;

import com.xworkz.facebook.entity.FacebookEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FacebookImpl implements Facebook {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("facebook");

    @Override
    public boolean saveFacebookInfo(FacebookEntity entity) {
        System.out.println("Inserting data");
        boolean insert = false;

        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            insert = true;
        } catch (Exception e) {
            e.printStackTrace();
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return insert;
    }

    @Override
    public String updateAllDetailsById(FacebookEntity entity) {
        System.out.println("Update details by Id");
        String isUpdate = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            FacebookEntity entityUpdate = em.find(FacebookEntity.class, 2);
            entityUpdate.setUserName(entity.getUserName());
            entityUpdate.setAccountPrivacy(entity.getAccountPrivacy());
            et.commit();
            isUpdate = "successfully done";
            System.out.println("OLD: " + entityUpdate.getUserName());
            System.out.println("NEW: " + entity.getUserName());

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
            FacebookEntity entity = em.find(FacebookEntity.class, Id);
            em.remove(entity);
            et.commit();
            isdelete = true;
        }catch (Exception e){
            e.printStackTrace();
            et.rollback();
        }finally {
            if (em != null) {
                em.close();
            }
        }
        return isdelete;
    }

}
