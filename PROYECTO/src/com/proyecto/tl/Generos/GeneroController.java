/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.tl.Generos;

import com.proyecto.bl.Factory.DaoFactory;
import com.proyecto.bl.Generos.Genero;
import com.proyecto.bl.Generos.IGeneroDao;
import java.util.ArrayList;


public class GeneroController {
    
    private IGeneroDao generoDao;
    private DaoFactory factory;
    
    public GeneroController(){
        
        factory = DaoFactory.getDaoFactory(1);
        generoDao = factory.getGeneroDao();
    }
    
    
    public void registrarGenero(String nombre, String descripcion){
        
        try {
            
            Genero generos = new Genero (nombre, descripcion);
            generoDao.insertarGenero(generos);
            
        } catch (Exception e) {
            
            e.printStackTrace();    
        }  
    }
    
    public ArrayList<Genero> listarGeneros()throws Exception{
        
        
        return generoDao.listarGenero();
        
    }
    
    
    
}
