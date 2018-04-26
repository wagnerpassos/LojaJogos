/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.dao;

import br.wagnerpassos.fabrica.ConnectionFactory;
import br.wagnerpassos.modelo.bean.Jogador;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.bean.Torneio;
import br.wagnerpassos.modelo.validador.Validador;
import java.util.ArrayList;
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
        ConnectionFactory.getInstance().closeAll();
    }
        
    public void save(Torneio torneio, Jogador jogador){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        Torneio t = em.find(Torneio.class, torneio.getId());
        Jogador j = em.find(Jogador.class, jogador.getId());
        
        t.getJogadoresTorneio().add(j);
        
        em.getTransaction().begin();
        em.merge(torneio);
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeAll();
    }
    
    public List<Torneio> read(){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("SELECT torneio FROM Torneio torneio");
        List<Torneio> torneios = consulta.getResultList();
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeAll();
        return torneios;
    }
    
    public void delete(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Torneio torneio = em.find(Torneio.class, id);
        em.remove(torneio);
        em.getTransaction().commit();
        ConnectionFactory.getInstance().closeAll();
    }
    
    public Torneio findById(Integer id){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        
        em.getTransaction().begin();
        Torneio torneio = em.find(Torneio.class, id);
        ConnectionFactory.getInstance().closeAll();
        
        return torneio;
    }
    
    public List<Jogador> findListaJogadores(Torneio torneio){
        EntityManager em = ConnectionFactory.getInstance().getEntityManager();
        List<Jogador> jogadores = new ArrayList();
        
        em.getTransaction().begin();
        Torneio t = em.find(Torneio.class, torneio.getId());
        jogadores.addAll(t.getJogadoresTorneio());
        ConnectionFactory.getInstance().closeAll();
        
        return jogadores;
    }
}
