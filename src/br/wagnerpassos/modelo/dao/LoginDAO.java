/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.dao;

import br.wagnerpassos.fabrica.ConnectionFactory;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.validador.Validador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author wagne
 */
public class LoginDAO {
    public void save(Login login){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        Validador validador = new Validador();
        
        em.getTransaction().begin();
        if(validador.validarLogin(login).size() <= 0){
            if(login.getId() != null)
                em.merge(login);
            else
                em.persist(login);
            em.getTransaction().commit();
        }
        ConnectionFactory.getInstance().closeAll();
    }
    
    public List<Login> read(){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT login FROM Login login");
        List<Login> logins = consulta.getResultList();
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeAll();
        return logins;
    }
    
    public void delete(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Login login = em.find(Login.class, id);
        em.remove(login);
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public Login findById(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Login login = em.find(Login.class, id);
        ConnectionFactory.getInstance().closeAll();
        
        return login;
    }
    
    public Login realizarLogin(String usuario, String senha){
        Login login =  null;
        try {
                EntityManager em = ConnectionFactory.getInstance().getEntityManager();
                EntityTransaction et = em.getTransaction();
                et.begin();

                login = (Login) em.createQuery("SELECT l FROM Login l "
                                                  + " WHERE l.usuario = '"+ usuario +"' AND l.senha = '"+ senha +"'").getSingleResult();
                et.commit();
                ConnectionFactory.getInstance().closeAll();
        } catch (Exception e) {
        }

        return login;
    }
}