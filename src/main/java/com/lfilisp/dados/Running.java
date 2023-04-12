//package com.lfilisp.dados;
//
//import com.lfilisp.dados.model.Bdd_massas;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class Running {
//    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banco");
//    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
//    public static void main(String[] args){
//        Bdd_massas massas = entityManager.find(Bdd_massas.class, 2);
//        System.out.println("nome do cliente:" + massas.getNAME_PRODUCT());
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//}
