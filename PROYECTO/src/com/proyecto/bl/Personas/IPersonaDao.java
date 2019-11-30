/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Personas;

import java.util.ArrayList;

public interface IPersonaDao {
    
    public void insertar(Persona persona) throws Exception;
    public boolean existeAdmin()throws Exception;
    public void modificar(Administrador admin) throws Exception;
    public void modificar(Cliente cliente) throws Exception;
    public void eliminar(String cedula)throws Exception;
    public boolean buscarUsuario (String nombreUsuario, String contrasenia)throws Exception;
    public ArrayList<Cliente> listarC()throws Exception;
 
    
}
