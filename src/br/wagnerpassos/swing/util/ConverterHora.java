/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.swing.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author wagne
 */
public class ConverterHora extends Converter<Object, Object>{
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    // objeto para a tela
    @Override
    public Object convertForward(Object value) {
        Date c = (Date) value;
        return sdf.format(c.getTime());
    }

    // tela o objeto
    @Override
    public Object convertReverse(Object value) {
        String str = (String) value;
        Date c = new Date();
        try {
            c = sdf.parse(str);
            return c;
        }catch (Exception e ){
            return null;
        }
    }
}

