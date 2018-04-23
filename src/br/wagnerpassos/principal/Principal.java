/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.principal;

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
        login.setUsuario("Wagner Passos");
        login.setSenha("");
        
        LoginDAO loginDAO = new LoginDAO();
        loginDAO.save(login);
        /*for(Login l : loginDAO.read()){
        System.out.println("=====================");
            System.out.println("Usuario: "+l.getUsuario());
            System.out.println("Senha: "+l.getSenha());
        }*/
    }
}
