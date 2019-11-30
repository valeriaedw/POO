/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Personas;


public class Administrador extends Persona{
    
    //Constructor
    public Administrador(String id, String nombre, String apellido1, String apellido2, String avatar, String correo, String nombreUsuario, String contrasenia, String tipo) {
        super(id, nombre, apellido1, apellido2, avatar, correo, nombreUsuario, contrasenia, tipo);
    }

  
   
    
    //toString
     public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
