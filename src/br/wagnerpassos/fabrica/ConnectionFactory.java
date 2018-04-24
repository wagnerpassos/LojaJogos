/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wagne
 */
public class ConnectionFactory {
    private static ConnectionFactory instancia = null; 
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;
    
    private ConnectionFactory(){
    }
    
    public static ConnectionFactory getInstance(){
        if(instancia == null)
            instancia = new ConnectionFactory();
        return instancia;
    }
    
    public EntityManager getEntityManager(){
        if(emf == null)
            emf = Persistence.createEntityManagerFactory("lojaPU");
        //if(em == null)
            em = emf.createEntityManager();
        return em;
    }
    
    public void closeEntityManager(){
        em.close();
    }
    
    public void closeAll(){
        if(em.isOpen())
            em.close();
        if(emf.isOpen())
            emf.close();
    }
}
