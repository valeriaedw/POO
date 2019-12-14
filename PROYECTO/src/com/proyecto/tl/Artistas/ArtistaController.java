/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.tl.Artistas;

import com.proyecto.bl.Artistas.Artista;
import com.proyecto.bl.Artistas.IArtistaDao;
import com.proyecto.bl.Factory.DaoFactory;
import java.time.LocalDate;
import java.util.ArrayList;


public class ArtistaController {
    
    private IArtistaDao artistaDao;
    private DaoFactory factory;
    
    public ArtistaController(){
        
        factory = DaoFactory.getDaoFactory(1);
        artistaDao = factory.getArtistaDao();
        
    }
    
    public ArrayList<String> llenarGeneros () throws Exception{
        
        return artistaDao.llenarGenero();      
    }
    
    public void registroArtista (String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, int edad, String paisNacimiento, String genero, String descripcion){
        
        try {
            
            Artista artistas = new Artista (nombre,apellido,nombreArtistico,fechaNacimiento,fechaDefuncion,edad,paisNacimiento,genero,descripcion);
            artistaDao.insertarArtista(artistas);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public ArrayList <Artista> listarArtistas() throws Exception{
        
        return artistaDao.listarArtista();
        
    }
    
    
}
