/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.dao;

import br.wagnerpassos.fabrica.ConnectionFactory;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.bean.Torneio;
import br.wagnerpassos.modelo.validador.Validador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author wagne
 */
public class TorneioDAO {
        public void save(Torneio torneio){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        Validador validador = new Validador();
        
        em.getTransaction().begin();
        if(validador.validarTorneio(torneio).size() <= 0){
            if(torneio.getId() != null)
                em.merge(torneio);
            else
                em.persist(torneio);
            em.getTransaction().commit();
        }
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public List<Torneio> read(){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT torneio FROM Torneio torneio");
        List<Torneio> torneios = consulta.getResultList();
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
        return torneios;
    }
    
    public void delete(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Torneio torneio = em.find(Torneio.class, id);
        em.remove(torneio);
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeEntityManager();
    }
    
    public Torneio findById(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Torneio torneio = em.find(Torneio.class, id);
        ConnectionFactory.getInstance().closeEntityManager();
        
        return torneio;
    }
}
