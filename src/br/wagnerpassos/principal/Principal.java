/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.principal;

import br.wagnerpassos.fabrica.ConnectionFactory;
import br.wagnerpassos.fabrica.DAOFactory;
import br.wagnerpassos.modelo.bean.Jogador;
import br.wagnerpassos.modelo.bean.Login;
import br.wagnerpassos.modelo.dao.LoginDAO;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author wagne
 */
public class Principal {
    public static void main(String[] args) {
        Login login = new Login();
        login.setUsuario("WAGNERMAX");
        login.setSenha("swordfish");
        
        Jogador jogador = new Jogador();
        jogador.setSexo("Masculino");
        jogador.setLogin(DAOFactory.getLoginDAO().findById(2));
        jogador.setApelido("Sem apelido");
        jogador.setNome("Wagner Alves Passos");
        
        DAOFactory.getJogadorDAO().save(jogador);
        
        //DAOFactory.getLoginDAO().save(login);
        
        /*for(Login l : loginDAO.read()){
        System.out.println("=====================");
            System.out.println("Usuario: "+l.getUsuario());
            System.out.println("Senha: "+l.getSenha());
        }*/
        
        ConnectionFactory.getInstance().closeAll();
    }
}
