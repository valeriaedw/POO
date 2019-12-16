/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.tl.Cupones;

import com.tupuntodeventa.bl.Cupon.Cupon;
import com.tupuntodeventa.bl.Cupon.ICuponDao;
import com.tupuntodeventa.bl.Factory.DaoFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valeria
 */
public class CuponesController {
        
    private ICuponDao cuponDao;
    private DaoFactory factory;
    
    
    public CuponesController(){
        
        factory = DaoFactory.getDaoFactory(1);
        cuponDao = factory.getcuponDao();   
    }
    
    public void registroCupon (LocalDate fechaGenerado, float descuento, String estado){
        
        try {
            Cupon cupon = new Cupon (fechaGenerado,descuento, estado);
            cuponDao.insertar(cupon);
        } catch (Exception ex) {
            Logger.getLogger(CuponesController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public ArrayList<Cupon> listarCupon() throws Exception{
        
        return cuponDao.listar();
    }
}
