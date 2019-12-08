/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Compositores;

import java.util.ArrayList;


public interface ICompositorDao {
    
    public void insertarCompositor (Compositor compositor) throws Exception;
    public ArrayList <Compositor> listarCompositor () throws Exception;
    public void modificarCompositor (Compositor compositor) throws Exception;
    public void eliminarCompositor (Compositor compositor) throws Exception;
    
}
