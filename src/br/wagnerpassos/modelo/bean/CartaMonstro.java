/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author wagne
 */
@Entity
@Table(name = "carta_monstro")
public class CartaMonstro extends Carta implements Serializable{
    @Column(name = "atributo", nullable = false, length = 20)
    private String atributo;
    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;
    @Column(name = "ataque", nullable = false)
    private Integer ataque;
    @Column(name = "defesa")
    private Integer defesa;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "rank")
    private Integer rank;
    @Column(name = "link")
    private Integer link;

    public CartaMonstro(){
    }
    
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getLink() {
        return link;
    }

    public void setLink(Integer link) {
        this.link = link;
    } 
}
