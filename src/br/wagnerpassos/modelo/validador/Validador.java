/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.modelo.validador;

import br.wagnerpassos.modelo.bean.Jogador;
import br.wagnerpassos.modelo.bean.Login;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 *
 * @author wagne
 */
public class Validador {
    public boolean validarLogin(Login login){
         Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
         Set<ConstraintViolation<Login>> erros = validador.validate(login);
         if(erros.size() > 0){
             erros.forEach((erro) -> {
                 System.out.println("ERRO: "+ erro.getMessage());
             });
             return false;
         } else
             return true;
    }
    
    public boolean validarJogador(Jogador jogador){
         Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
         Set<ConstraintViolation<Jogador>> erros = validador.validate(jogador);
         if(erros.size() > 0){
             erros.forEach((erro) -> {
                 System.out.println("ERRO: "+ erro.getMessage());
             });
             return false;
         } else
             return true;
    }
}
