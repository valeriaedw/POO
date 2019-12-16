/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Plato;

import com.tupuntodeventa.bl.Combo.Combo;
import com.tupuntodeventa.dl.AccesoBD;
import com.tupuntodeventa.dl.Conexion;

/**
 *
 * @author Valeria
 */
public class SqlPlatoDao implements IPlatoDao{
    
    String sql;
    
    @Override
    public void insertar(Plato plato) throws Exception {
        
        try {
            
           sql="INSERT INTO PLATO VALUES ('"+plato.getIdentificador()+"','"+plato.getPrecio()+"','"+plato.getDescripcion()+"')"; 
           AccesoBD acceso = Conexion.getConnector();
           acceso.ejecutarSql(sql);
  
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
    
}
