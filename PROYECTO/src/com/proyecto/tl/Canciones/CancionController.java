/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.tl.Canciones;

import com.proyecto.bl.Albumes.Album;
import com.proyecto.bl.Artistas.Artista;
import com.proyecto.bl.Canciones.Cancion;
import com.proyecto.bl.Canciones.ICancionDao;
import com.proyecto.bl.Compositores.Compositor;
import com.proyecto.bl.Factory.DaoFactory;
import com.proyecto.bl.Generos.Genero;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class CancionController {

    private ICancionDao cancionDao;
    private DaoFactory factory;

    public CancionController() {

        factory = DaoFactory.getDaoFactory(1);
        cancionDao = factory.getCancionDao();

    }

    public void registroCancion(String cancion, String nombre, String generoCancion, String artista, String compositor, LocalDate fechaLanzamiento, String albumCancion,String estado, double precio, int calificacion) throws Exception {
        
        try {

            Cancion canciones = new Cancion(cancion, nombre, generoCancion, artista, compositor, fechaLanzamiento, albumCancion, estado, precio, calificacion);
            cancionDao.insertarCancion(canciones);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String[] listarCanciones(){
        
        ArrayList<Cancion> lista = null;
        String[] listaDatos = null;
        
        try {
            
            lista=cancionDao.listarCancion();
            listaDatos = new String [lista.size()];
            
            for(int x =0; x < listaDatos.length; x++){
                
                listaDatos[x] = lista.get(x).toString();
                
            }
               
        }catch(Exception e){
            
            e.printStackTrace();
        }
        return listaDatos;
        
    }

}
