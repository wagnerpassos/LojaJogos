/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.swing.util;

import java.util.List;
import javafx.scene.control.ButtonBar;
import javax.swing.JOptionPane;

/**
 *
 * @author wagne
 */
public class ImpressoraSwing {
    private static ImpressoraSwing impressora = null;
    
    private ImpressoraSwing(){
    }
    
    public static ImpressoraSwing getInstance(){
        if(impressora == null)
            impressora = new ImpressoraSwing();
        return impressora;
    }
    
    public void impressoraJOP(List<String> listaImprimir){
        StringBuilder strBuilder = new StringBuilder();
        for(String imp : listaImprimir)
            strBuilder.append(imp + "\n");
        JOptionPane.showMessageDialog(null, strBuilder);
    }
    
    public void impressoraJOP(String imprimir){
        JOptionPane.showMessageDialog(null, imprimir);
    }
    
    public Integer impressoraConfirmacao(String imprimir){
        return JOptionPane.showConfirmDialog(null, imprimir, "NOME LOJA", JOptionPane.YES_NO_OPTION);  
    }
}
