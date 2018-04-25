/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.swing.util;

import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author wagne
 */
public class ConverterDouble extends Converter<Object, Object>{

    @Override
    public Object convertForward(Object value) {
        Double c = (Double) value;
        return c.toString();
    }

    @Override
    public Object convertReverse(Object value) {
        String str = String.valueOf(value);
        Double c;
        try {
            c = Double.parseDouble(str);
            return c;
        }catch (Exception e ){
            return null;
        }
    }
    
}
