/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Combo;

/**
 *
 * @author Valeria
 */
public class SqlComboDao implements IComboDao{
    String sql;
    
    @Override
    public void insertar(Combo combo) throws Exception {
        
        try {
            sql = "INSERT INTO COMBO VALUES ('"+combo.getIdentificador()+"','"+combo.getNombre()+"','"+combo.getCostoTotal()+"')";
        } catch (Exception e) {
            
            e.printStackTrace();
        }
      
    }
    
}
