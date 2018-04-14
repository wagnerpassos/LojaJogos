/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.dao;

import br.wagnerpassos.connection.ConnectionFactory;
import br.wagnerpassos.modelo.bean.Login;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author wagne
 */
public class LoginDAO {
    public void save(Login login){
        EntityManager em = ConnectionFactory.getConnection();
        
        em.getTransaction().begin();
        if(login.getId() != null)
            em.merge(login);
        else
            em.persist(login);
        em.getTransaction().commit();
        ConnectionFactory.closeConnection();
    }
    
    public List<Login> read(){
        EntityManager em = ConnectionFactory.getConnection();
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT login FROM Login login");
        List<Login> logins = consulta.getResultList();
        em.getTransaction().commit();
        ConnectionFactory.closeConnection();
        return logins;
    }
    
    public Login update(Login login){
        return null;
    }
    
    public void delete(Integer id){
        EntityManager em = ConnectionFactory.getConnection();
        
        em.getTransaction().begin();
        Login login = em.find(Login.class, id);
        em.remove(login);
        em.getTransaction().commit();
        ConnectionFactory.closeConnection();
    }
    
    public Login findById(Integer id){
        EntityManager em = ConnectionFactory.getConnection();
        
        em.getTransaction().begin();
        Login login = em.find(Login.class, id);
        ConnectionFactory.closeConnection();
        
        return login;
    }
}
