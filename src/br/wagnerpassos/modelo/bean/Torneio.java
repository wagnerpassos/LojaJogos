/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author wagne
 */
@Entity
@Table(name = "torneio")
public class Torneio implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome", length = 30, nullable = false)
    private String nome;
    @Column(name = "nivel", length = 15, nullable = false)
    private String nivel;
    @Column(name = "data_torneio", length = 10)
    @Temporal(TemporalType.DATE)
    private Calendar dataTorneio;
    @Column(name = "horario")
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Column(name = "jogo")
    private String jogo;
    @Column(name = "descricao", length = 300)
    private String descricao;
    @Column(name = "valor", columnDefinition = "decimal(12,2)")
    private Double valor;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "jogadores_torneio", 
                joinColumns = @JoinColumn(name = "torneio", referencedColumnName = "id", nullable = false),
                inverseJoinColumns = @JoinColumn(name = "jogador", referencedColumnName = "id", nullable = false),
                uniqueConstraints = {@UniqueConstraint(columnNames = {"jogador", "torneio"})})
    List<Jogador> jogadoresTorneio = new ArrayList<Jogador>();

    public Torneio() {
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Calendar getDataTorneio() {
        return dataTorneio;
    }

    public void setDataTorneio(Calendar dataTorneio) {
        this.dataTorneio = dataTorneio;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Jogador> getJogadoresTorneio() {
        return jogadoresTorneio;
    }

    public void setJogadoresTorneio(List<Jogador> jogadoresTorneio) {
        this.jogadoresTorneio = jogadoresTorneio;
    }

    @Override
    public String toString() {
        return nome;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Torneio other = (Torneio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    public String getDataFormatada(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataTorneio.getTime());
    }
    
    public String getHoraFormatada(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(horario.getTime());
    }
    
    public String getValorFormatado(){
        return "R$ "+ valor.toString();
    }
 }
