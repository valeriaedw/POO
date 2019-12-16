/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Cupon;

import com.tupuntodeventa.dl.AccesoBD;
import com.tupuntodeventa.dl.Conexion;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class SqlCuponDao implements ICuponDao{
    String sql;
    
    @Override
    public void insertar(Cupon cupon) throws Exception {
        
        try {
            
            sql = "INSERT INTO CUPON VALUES ('"+cupon.getFechaGenerado()+"','"+cupon.getDescuento()+"','"+cupon.getEstado()+"')";
            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql); 
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }

    @Override
    public ArrayList<Cupon> listar() throws Exception {
        
        ArrayList <Cupon> listarCupon = new ArrayList<>();
        
        try {
            
            ResultSet rs = null;
            Cupon cupon = null;
            
            sql = "SELECT * FROM CUPON";
            rs = Conexion.getConnector().ejecutarQuery(sql);
            
            while(rs.next()){
                
                LocalDate fecha = rs.getDate("fecha_generado").toLocalDate();
                
                cupon = new Cupon (fecha,
                        rs.getFloat("descuento"),rs.getString("estado"));
                
                listarCupon.add(cupon);      
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listarCupon;
    }
    
}
