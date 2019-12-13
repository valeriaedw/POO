/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Compositores;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;


public class SqlCompositorDao implements ICompositorDao{
    
    private String sql; 
    
    @Override
    public void insertarCompositor(Compositor compositor) throws Exception {
        
        try {
            
            sql= "INSERT INTO COMPOSITOR (NOMBRE, APELLIDO, PAIS, FECHA_NACIMIENTO,EDAD)VALUES('"+compositor.getNombre()+"','"+compositor.getApellido()+"','"+compositor.getPaisNacimiento()+"','"+compositor.getFechaNacimiento()+"',"+compositor.getEdad()+")";
            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);
            
        } catch (Exception e) {
            
            throw new Exception("Error al intentar registar un compositor: " + e.getMessage());    
        }   
    }

    @Override
    public ArrayList<Compositor> listarCompositor() throws Exception {
        
        ArrayList <Compositor> listaCompositor = new ArrayList<>();
        try {
            
            ResultSet rs = null;
            Compositor compositor = null;
            
            sql = "SELECT NOMBRE, APELLIDO, PAIS, FECHA_NACIMIENTO, EDAD FROM COMPOSITOR";
            rs = Conexion.getConnector().ejecutarQuery(sql);
            
            while (rs.next()){
                
                 LocalDate fecha = rs.getDate("fecha_nacimiento").toLocalDate();
                
                compositor = new Compositor (
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("pais"),
                    fecha,
                    rs.getInt("edad"));
                    
                listaCompositor.add(compositor);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaCompositor;
        
    }

    @Override
    public void modificarCompositor(Compositor compositor) throws Exception {
        
    }

    @Override
    public void eliminarCompositor(Compositor compositor) throws Exception {
        
    }
    
}
