package chamada_bdd;

import bdd.bdd_massas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class teste {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Base");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    public static void main(String[] args){
        bdd_massas massas = entityManager.find(bdd_massas.class, 2);
        System.out.println("nome do cliente:" + massas.getNAME_PRODUCT());
    }
}
