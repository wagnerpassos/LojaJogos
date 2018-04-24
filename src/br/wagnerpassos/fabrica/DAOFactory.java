/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.fabrica;

import br.wagnerpassos.modelo.dao.JogadorDAO;
import br.wagnerpassos.modelo.dao.LoginDAO;

/**
 *
 * @author wagne
 */
public class DAOFactory {
    private static LoginDAO loginDAO = null;
    private static JogadorDAO jogadorDAO = null;

    private DAOFactory(){
    }
    
    public static LoginDAO getLoginDAO() {
        if(loginDAO == null)
            loginDAO = new LoginDAO();
        return loginDAO;
    }

    public static JogadorDAO getJogadorDAO() {
        if(jogadorDAO == null)
            jogadorDAO = new JogadorDAO();
        return jogadorDAO;
    }        
}
