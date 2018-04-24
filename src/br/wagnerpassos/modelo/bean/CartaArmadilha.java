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
@Table(name = "carta_armadilha")
public class CartaArmadilha extends Carta implements Serializable{
    @Column(name = "tipo")
    private String tipo;

    public CartaArmadilha() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
