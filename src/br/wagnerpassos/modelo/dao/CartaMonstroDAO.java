/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.dao;

import br.wagnerpassos.fabrica.ConnectionFactory;
import br.wagnerpassos.modelo.bean.CartaMonstro;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.validador.Validador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author wagne
 */
public class CartaMonstroDAO {
        public void save(CartaMonstro monstro){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        Validador validador = new Validador();
        
        em.getTransaction().begin();
        if(validador.validarCartaMonstro(monstro)){
            if(monstro.getId() != null)
                em.merge(monstro);
            else
                em.persist(monstro);
            em.getTransaction().commit();
        }
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public List<CartaMonstro> read(){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT cartaMonstro FROM CartaMonstro cartaMonstro");
        List<CartaMonstro> monstros = consulta.getResultList();
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
        return monstros;
    }
    
    public void delete(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        CartaMonstro cartaMonstro = em.find(CartaMonstro.class, id);
        em.remove(cartaMonstro);
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public CartaMonstro findById(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        CartaMonstro monstro = em.find(CartaMonstro.class, id);
        ConnectionFactory.getInstance().closeEntityManager();
        
        return monstro;
    }
}
