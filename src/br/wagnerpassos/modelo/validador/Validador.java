/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.validador;

import br.wagnerpassos.modelo.bean.CartaMonstro;
import br.wagnerpassos.modelo.bean.Jogador;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.bean.Torneio;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 *
 * @author wagne
 */
public class Validador {
    public List<String> validarLogin(Login login){
         Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
         Set<ConstraintViolation<Login>> erros = validador.validate(login);
         List<String> listaErros = new ArrayList<String>();
         
        if(erros.size() > 0)
             erros.forEach((erro) -> {
                 listaErros.add(erro.getMessage());
             });
        return listaErros;
    }
    
    public List<String> validarJogador(Jogador jogador){
         Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
         Set<ConstraintViolation<Jogador>> erros = validador.validate(jogador);
         List<String> listaErros = new ArrayList<String>();
         
        if(erros.size() > 0)
             erros.forEach((erro) -> {
                 listaErros.add(erro.getMessage());
             });
        return listaErros;
    }
    
    public boolean validarCartaMonstro(CartaMonstro monstro){
         Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
         Set<ConstraintViolation<CartaMonstro>> erros = validador.validate(monstro);
         if(erros.size() > 0){
             erros.forEach((erro) -> {
                 System.out.println("ERRO: "+ erro.getMessage());
             });
             return false;
         } else
             return true;
    }
    
    public List<String> validarTorneio(Torneio torneio){
         Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
         Set<ConstraintViolation<Torneio>> erros = validador.validate(torneio);
         List<String> listaErros = new ArrayList<String>();
         
        if(erros.size() > 0)
             erros.forEach((erro) -> {
                 listaErros.add(erro.getMessage());
             });
        return listaErros;
    }
}
