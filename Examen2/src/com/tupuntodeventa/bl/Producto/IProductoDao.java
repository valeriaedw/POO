/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Producto;

import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public interface IProductoDao {
    
  
    public ArrayList <Producto> listar ()throws Exception;
    
}
