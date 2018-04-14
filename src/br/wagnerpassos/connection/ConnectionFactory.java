/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wagne
 */
public class ConnectionFactory {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    private ConnectionFactory(){
    }
    
    public static EntityManager getConnection(){
        if(emf == null)
            emf = Persistence.createEntityManagerFactory("lojaPU");
        em = emf.createEntityManager();
        return em;
    }
    
    public static void closeConnection(){
        em.close();
        emf.close();
    }
}
