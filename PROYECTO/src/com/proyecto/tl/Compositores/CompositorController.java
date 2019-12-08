/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.tl.Compositores;

import com.proyecto.bl.Compositores.Compositor;
import com.proyecto.bl.Compositores.ICompositorDao;
import com.proyecto.bl.Factory.DaoFactory;
import java.time.LocalDate;


public class CompositorController {
    
    private ICompositorDao compositorDao;
    private DaoFactory factory;
    
    public CompositorController(){
        
        factory = DaoFactory.getDaoFactory(1);
        compositorDao = factory.getCompositorDao();  
    }
    
    public void registrarCompositor (String nombre, String apellido, String pais, LocalDate fecha, int edad){
        
        try {
            Compositor compositores = new Compositor (nombre, apellido, pais, fecha, edad);
            compositorDao.insertarCompositor(compositores);
            
        } catch (Exception e) {
            
            e.printStackTrace(); 
        }
        
        
    }
    
    
    
}
