package com.xworkz.movie.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class MovieUpdate {
    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            emf = Persistence.createEntityManagerFactory("movies");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            MovieEntity entity = em.find(MovieEntity.class, 1);
            System.out.println("old data: " + entity);
            entity.setReleaseYear(2025);
            MovieEntity updateEntity = em.merge(entity);
            System.out.println("update data: " + updateEntity);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        } finally {
            if (emf != null) {
                emf.close();

            }
        }
    }
}
