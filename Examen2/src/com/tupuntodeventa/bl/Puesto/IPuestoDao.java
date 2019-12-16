/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Puesto;


import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public interface IPuestoDao {
    public void insertar (Puesto puesto)throws Exception;
    public ArrayList <Puesto> listar ()throws Exception;
    
}
