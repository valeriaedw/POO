/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Cupon;

import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public interface ICuponDao {
    
    public void insertar (Cupon cupon)throws Exception;
    public ArrayList <Cupon> listar ()throws Exception;
    
}
