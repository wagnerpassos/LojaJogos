/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.bean;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author wagne
 */
@Entity
@Table(name = "jogador")
public class Jogador implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Length(max = 50, message = "O nome do jogador deve ser de no máximo {max} caracteres")
    @NotBlank(message = "O campo nome não pode ficar em branco")
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "apelido", length = 50)
    private String apelido;
    @NotBlank(message = "O campo sexo não pode ficar em branco")
    @Column(name = "sexo", length = 10)
    private String sexo;
    @OneToOne
    @JoinColumn(name = "login_id", referencedColumnName = "id")
    @ForeignKey(name = "fk_login")
    private Login login;  
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "jogadores_torneio", 
               joinColumns = @JoinColumn(name = "jogador", referencedColumnName = "id", nullable = false),
               inverseJoinColumns = @JoinColumn(name = "torneio", referencedColumnName = "id", nullable = false),
               uniqueConstraints = {@UniqueConstraint(columnNames = {"jogador", "torneio"})})
    List<Torneio> torneioJogador = new ArrayList<Torneio>();
    
    public Jogador() {
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }  

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<Torneio> getTorneioJogador() {
        return torneioJogador;
    }

    public void setTorneioJogador(List<Torneio> torneioJogador) {
        this.torneioJogador = torneioJogador;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
