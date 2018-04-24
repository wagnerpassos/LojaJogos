/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.dao;

import br.wagnerpassos.fabrica.ConnectionFactory;
import br.wagnerpassos.modelo.bean.Jogador;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.validador.Validador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author wagne
 */
public class JogadorDAO {
        public void save(Jogador jogador){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        Validador validador = new Validador();
        
        em.getTransaction().begin();
        if(validador.validarJogador(jogador)){
            if(jogador.getId() != null)
                em.merge(jogador);
            else
                em.persist(jogador);
            em.getTransaction().commit();
        }
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public List<Login> read(){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT login FROM Login login");
        List<Login> logins = consulta.getResultList();
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
        return logins;
    }
    
    public void delete(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Jogador jogador = em.find(Jogador.class, id);
        em.remove(jogador);
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public Jogador findById(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Jogador jogador = em.find(Jogador.class, id);
        ConnectionFactory.getInstance().closeEntityManager();
        
        return jogador;
    }
}
