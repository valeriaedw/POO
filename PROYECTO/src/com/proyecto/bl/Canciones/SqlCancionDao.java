/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Canciones;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class SqlCancionDao implements ICancionDao{
    
    private String sql; 
    
    @Override
    public void insertarCancion(Cancion cancion) throws Exception {
        try {
            
            sql = "INSERT INTO CANCION ('"+cancion.getCancion()+"','"+cancion.getNombre()+"','"+cancion.getGeneroCancion()+"','"+cancion.getArtista()+"','" 
                    +cancion.getCompositor()+"','"+cancion.getFechaLanzamiento()+"','"+cancion.getAlbumCancion()+"','"+cancion.getEstado()+"','"
                    +cancion.getPrecio()+"',"+cancion.getCalificacion()+")";
         
            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Cancion> listarCanion() throws Exception {
         return null;
    }

    @Override
    public void modificarCancion(Cancion cancion) throws Exception {
       
    }

    @Override
    public void eliminarCancion(Cancion cancion) throws Exception {
        
    }
    
}
