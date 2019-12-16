/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.tl.Platos;

import com.tupuntodeventa.bl.Factory.DaoFactory;
import com.tupuntodeventa.bl.Plato.IPlatoDao;
import com.tupuntodeventa.bl.Plato.Plato;
import com.tupuntodeventa.bl.Puesto.IPuestoDao;

/**
 *
 * @author Valeria
 */
public class PlatosController {
    
    private DaoFactory factory;
    private IPlatoDao platoDao; 
    
    public void PlatosController(){
        
        factory = DaoFactory.getDaoFactory(1);
        platoDao = factory.getplatoDao();   
    }
    
    public void registrarPlato(Float precio, String descripcion, int identificador) throws Exception{
        
        Plato plato = new Plato (precio, descripcion, identificador);
        platoDao.insertar(plato);
    }
    
    
    
}
