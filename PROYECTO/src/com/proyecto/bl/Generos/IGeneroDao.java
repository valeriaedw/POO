/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Generos;

import java.util.ArrayList;


public interface IGeneroDao {
    
    public void insertarGenero (Genero genero) throws Exception;
    public ArrayList <Genero> listarGenero () throws Exception;
    public void modificarGenero (Genero genero) throws Exception;
    public void eliminarGenero (Genero genero) throws Exception;
    
}
