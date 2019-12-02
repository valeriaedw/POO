/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Canciones;

import java.util.ArrayList;

public interface ICancionDao {
    
    public void insertarCancion (Cancion cancion) throws Exception;
    public ArrayList <Cancion> listarCancion () throws Exception;
    public void modificarCancion (Cancion cancion) throws Exception;
    public void eliminarCancion (Cancion cancion) throws Exception;
    
    
}
