/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Orden;

import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public interface IOrdenDao {
    public void insertar (Orden orden)throws Exception;
    public ArrayList <Orden> listar ()throws Exception;
    
}
