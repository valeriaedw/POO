/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Compositores;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
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
        
        return null;
    }

    @Override
    public void modificarCompositor(Compositor compositor) throws Exception {
        
    }

    @Override
    public void eliminarCompositor(Compositor compositor) throws Exception {
        
    }
    
}
