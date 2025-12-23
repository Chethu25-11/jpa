package com.xworkz.instagram.repository;

import com.xworkz.instagram.entity.InstagramEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class InstagramImpl implements Instagram {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("instagram");

    @Override
    public boolean saveInventoryInfo(InstagramEntity entity) {
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
    public List<InstagramEntity> findAllInstagramEntity() {
        System.out.println("invoking findAllInstagramEntity in repository");
        List<InstagramEntity> instagramEntities = null;
        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findAllInstagramEntity");
            instagramEntities = query.getResultList();
            System.out.println("findallinstgram entity" + instagramEntities);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return instagramEntities;
    }

    @Override
    public String updateAllDetailsById(InstagramEntity entity) {
        System.out.println("Update details by Id");
        String isUpdate = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            InstagramEntity entityUpdate = em.find(InstagramEntity.class, 2);
            entityUpdate.setName(entity.getName());
            entityUpdate.setAccountPrivacy(entity.getAccountPrivacy());
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
            InstagramEntity entity = em.find(InstagramEntity.class, Id);
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


