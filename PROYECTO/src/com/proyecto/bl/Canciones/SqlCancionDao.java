/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Canciones;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
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
            
            sql = "INSERT INTO CANCION (CANCION, NOMBRE_CANCION, ID_GENERO, ID_ARTISTA, ID_COMPOSITOR, FECHA_LANZAMIENTO, ID_ALBUM, ESTADO, PRECIO, CALIFICACION) VALUES ('"+cancion.getCancion()+"','"+cancion.getNombre()+"','"+cancion.getGeneroCancion()+"','"+cancion.getArtista()+"','" 
                    +cancion.getCompositor()+"','"+cancion.getFechaLanzamiento()+"','"+cancion.getAlbumCancion()+"','"+cancion.getEstado()+"','"
                    +cancion.getPrecio()+"',"+cancion.getCalificacion()+")";
         
            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Cancion> listarCancion() throws Exception {
        ArrayList<Cancion> listaCancion = new ArrayList<>();
        try {
            ResultSet rs = null;
            Cancion cancion = null;
            sql = "SELECT CANCION, NOMBRE_CANCION, ID_GENERO, ID_ARTISTA, ID_COMPOSITOR, FECHA_LANZAMIENTO, ID_ALBUM,PRECIO, CALIFICACION FROM CANCION";
            rs = Conexion.getConnector().ejecutarQuery(sql);
            
            while(rs.next()){
                
               LocalDate date = rs.getDate("fecha_lanzamiento").toLocalDate();
               
            cancion = new Cancion(
                
                rs.getString("cancion"),   
                rs.getString("nombre_cancion"), 
                rs.getString("id_genero"), 
                rs.getString("id_artista"), 
                rs.getString("id_compositor"), 
                //rs.getLocalDate(date),arreglar esto
                rs.getString("id_album"),
                rs.getString("precio"), 
                rs.getString("calificacion"));
            
                listaCancion.add(cancion);
            
            }
            
            
            
            
        } catch (Exception e) {
        }
    }

    @Override
    public void modificarCancion(Cancion cancion) throws Exception {
       
    }

    @Override
    public void eliminarCancion(Cancion cancion) throws Exception {
        
    }
    
}
