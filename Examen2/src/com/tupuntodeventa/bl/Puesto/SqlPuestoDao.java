/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Puesto;

import com.tupuntodeventa.dl.AccesoBD;
import com.tupuntodeventa.dl.Conexion;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class SqlPuestoDao implements IPuestoDao{
    
    String sql;
    
    @Override
    public void insertar(Puesto puesto) throws Exception {
        
        try {
            
            sql="INSERT INTO PUESTO VALUES ('"+puesto.getNombre()+"','"+puesto.getSalarioBase()+"','"+puesto.getSalarioNeto()+"','"+puesto.getBono()+"','"+puesto.getFechaContratacion()+"')";
            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }

    @Override
    public ArrayList<Puesto> listar() throws Exception {
        
        ArrayList<Puesto> listarPuestos = new ArrayList<>();
        
        try {
            ResultSet rs = null;
            Puesto puesto = null;
            
            sql = "SELECT * FROM PUESTO";
            rs = Conexion.getConnector().ejecutarQuery(sql);
            
            while (rs.next()){
                LocalDate fecha = rs.getDate("fecha_contratacion").toLocalDate();
                
                puesto = new Puesto (rs.getString("nombre"),
                        rs.getFloat("salario_base"),
                        rs.getFloat("salario_neto"),
                        rs.getFloat("bono"),
                        fecha); 
                
                listarPuestos.add(puesto);
            }
      
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return listarPuestos;
    }
    
}
